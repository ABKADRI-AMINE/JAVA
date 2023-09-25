import java.sql.*;

public class Main {
	static Connection conn;
	Main(){};
	public static  Connection chargerPilote() {
		try {
		Class.forName("com.mysql.jdbc.Driver");//	Charger et configurer le driver de la base de données.
		conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/messagerie?autoReconnect=true&useSSL=false","root","amine123");//réaliser la connexion et l'authentification à la base de données.
		System.out.println("avec succees");
		}catch (SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException ee) {
			System.out.println(ee);
		}
		return conn;
 }
}
