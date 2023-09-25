package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class writeThread extends Thread {
	static Scanner  sc=new Scanner(System.in);
    private PrintWriter writer;
    private Socket socket;
    private client client;
 
    public writeThread(Socket socket, client client) {
        this.socket = socket;
        this.client = client;
 
        try {
            writer = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            System.out.println("Erreur : " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public void run() {
 
    	System.out.println("entrer votre nom");
    	String userName = sc.nextLine();
        client.setUserName(userName);
        writer.println(userName);
 
        String text;
 
        	while(true) {
        	System.out.println("--Utilisateur " + userName + "--: ");
        	text = sc.nextLine();
            writer.println(text);
        	}
 
    }
}