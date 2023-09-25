

import java.sql.*;

public class ex3ecole {
    private static Connection connexion;
    public static void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/ecole","root","amine");
        } catch (ClassNotFoundException erreur) {
            erreur.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    public static void afficheretudfilier(int numfiliere) {
        try {
            String query = "SELECT nomEtu, prenomEtu FROM Etudiant WHERE numFiliere=" + numfiliere;
            Statement stamt = connexion.createStatement();
            ResultSet rs = stamt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("nomEtu") + " " + rs.getString("prenomEtu"));
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    public static void afficheralletud() {
        try {
            String query = "SELECT nomEtu, prenomEtu, numFiliere FROM Etudiant";
            Statement stamt = connexion.createStatement();
            ResultSet rs = stamt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("nomEtu") + " " + rs.getString("prenomEtu") + " (Filière n°" + rs.getString("numFiliere") + ")");
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    public static void modifpren(int idetd, String prenometd) {
        try {
            String query = "UPDATE Etudiant SET prenomEtu=? WHERE idEtu=?";
            PreparedStatement stamt = connexion.prepareStatement(query);
            stamt.setString(1, prenometd);
            stamt.setInt(2, idetd);
            stamt.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    public static void ajoutetud(String nometd, String prenometd, int numfiliere) {
        try {
            String query = "INSERT INTO Etudiant(nomEtu, prenomEtu, numFiliere) VALUES (?,?,?)";
            PreparedStatement stamt = connexion.prepareStatement(query);
            stamt.setString(1, nometd);
            stamt.setString(2, prenometd);
            stamt.setInt(3, numfiliere);
            stamt.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
    public static void suppetud(int idetd) {
        try {
            String query = "DELETE FROM Etudiant WHERE idEtu=?";
            PreparedStatement stamt = connexion.prepareStatement(query);
            stamt.setInt(1, idetd);
            stamt.executeUpdate();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

}
