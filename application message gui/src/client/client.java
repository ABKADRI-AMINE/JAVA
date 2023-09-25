package client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	static Scanner  sc=new Scanner(System.in);
    private String hostname;
    private int port;
    private String userName;
 
    public client(String hostname,int port) {
        this.hostname = hostname;
        this.port = port;
    }
 
    public void execute() {
        try {
            Socket socket = new Socket(hostname,port);
 
            System.out.println("Vous etes connecte");
 
            new writeThread(socket, this).start();
            new readThread(socket, this).start();
            
 
        } catch (UnknownHostException ex) {
            System.out.println("Erreur serveur: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Erreur: " + ex.getMessage());
        }
 
    }
 
    void setUserName(String userName) {
        this.userName = userName;
    }
 
    String getUserName() {
        return this.userName;
    }
 
 
    public static void main(String[] args) {
        
//    	System.out.println("entrer le hostname");
//    	String hostname = sc.nextLine();
//        System.out.println("entrer le port");
//        int port = sc.nextInt();
 
        client client = new client("localhost",1000);
        client.execute();
    }
}