package serveur;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 

public class serveur {
	static Scanner  sc=new Scanner(System.in);
    private int port;
    
//    private Set<String> userNames = new HashSet<String>() {{add("users");}};
    private Set<String> userNames = new HashSet<String>();

    private Set<serveurThread> userThreads = new HashSet<>();
 
    public serveur(int port) {
        this.port = port;
    }
 
    public void execute() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
 
            System.out.println("Votre port est " + port);
 
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Nouveau utilisateur connecte");
 
                serveurThread newUser = new serveurThread(socket, this);
                userThreads.add(newUser);
                newUser.start();
 
            }
 
        } catch (IOException ex) {
            System.out.println("Erreur " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
//        System.out.println("entrer le port");
//        int port = sc.nextInt();
        serveur server = new serveur(2000);
        server.execute();
    }
 

    void broadcast(String message, serveurThread excludeUser) {
        for (serveurThread aUser : userThreads) {
            if (aUser != excludeUser) {
                aUser.sendMessage(message);
            }
        }
    }
 

    void addUserName(String userName) {
        userNames.add(userName);
    }
 

//    void removeUser(String userName, UserThread aUser) {
//        boolean removed = userNames.remove(userName);
//        if (removed) {
//            userThreads.remove(aUser);
//            System.out.println("The user " + userName + " quitted");
//        }
//    }
 
    Set<String> getUserNames() {
        return this.userNames;
    }
 
    /**
     * Returns true if there are other users connected (not count the currently connected user)
     */
    boolean hasUsers() {
        return !this.userNames.isEmpty();
    }
}