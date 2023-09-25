import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

private final int PORT = 12345; // Port d'écoute du serveur
private Map<String, Socket> clients = new HashMap<String, Socket>(); // Map pour stocker les clients connectés

// Méthode pour démarrer le serveur
public void start() {
        try {
        // Création du socket serveur et affichage d'un message de confirmation
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Serveur lancé sur le port " + PORT);

        // Boucle infinie pour écouter les connexions des clients et créer un nouveau thread pour chaque client connecté
        while (true) {
        Socket clientSocket = serverSocket.accept(); // Attente d'une connexion
        new Thread(new ClientHandler(clientSocket)).start(); // Création d'un thread pour gérer le client connecté
        }
        } catch (IOException e) { // Gestion des erreurs d'entrée/sortie
        e.printStackTrace();
        }
        }

// Méthode main pour lancer le serveur
public static void main(String[] args) {
        new Server().start(); // Création d'une instance de la classe Server et appel de la méthode start()
        }

// Classe interne pour gérer les clients connectés
private class ClientHandler implements Runnable {

    private Socket clientSocket; // Socket du client

    private BufferedReader in; // Flux de lecture des données reçues du client
    private PrintWriter out; // Flux d'écriture des données à envoyer au client

    // Constructeur pour initialiser le socket du client
    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    // Méthode run() pour gérer le client connecté
    @Override
    public void run() {
        try {
            // Création des flux d'entrée et de sortie pour communiquer avec le client
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Lecture de l'email et du mot de passe envoyés par le client
            String email = in.readLine();
            String password = in.readLine();

            // Vérification si le client est valide (présent dans la base de données)
            if (isValidClient(email, password)) {
                // Affichage d'un message de confirmation et stockage du client dans la map
                System.out.println("Client connecté : " + email);
                clients.put(email, clientSocket);
                out.println("OK"); // Envoi d'un message de confirmation au client
                Sidebar side =  new Sidebar(clients,email); // Création d'une instance de la classe Sidebar pour afficher la liste des clients connectés
                side.setVisible(true); // Affichage de la Sidebar

            } else {
                // Affichage d'un message d'erreur et fermeture de la connexion avec le client
                System.out.println("Tentative de connexion invalide avec l'email : " + email);
                out.println("ERREUR"); // Envoi d'un message d'erreur au client
                clientSocket.close(); // Fermeture du socket du client
            }
        } catch (IOException e) { // Gestion des erreurs d'entrée/sortie
            e.printStackTrace();
        }
    }

    // Méthode qui vérifie si un client est valide en vérifiant ses informations d'identification
    public Boolean isValidClient(String email, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
// Chargement du pilote JDBC pour MySQL et établissement de la connexion avec la base de données
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testch", "root", "");
            // Requête pour compter le nombre de clients ayant l'adresse e-mail et le mot de passe donnés
            String sql = "SELECT COUNT(*) FROM clients WHERE email = ? AND password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            // Récupération du nombre de clients correspondants et retour de la réponse
            rs.next();
            int count = rs.getInt(1);
            return count == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Fermeture des ressources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }