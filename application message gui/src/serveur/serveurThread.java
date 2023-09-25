package serveur;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;
 
public class serveurThread extends Thread {
    private Socket socket;
    private serveur server;
    private PrintWriter writer;
 
    public serveurThread(Socket socket, serveur server) {
        this.socket = socket;
        this.server = server;
    }
 
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
            writer = new PrintWriter(socket.getOutputStream(), true);
            
            String tableUser=server.getUserNames().toString();
            if(tableUser!=null)server.broadcast(tableUser, this);
            
            printUsers();
 
            String userName = reader.readLine();
            server.addUserName(userName);
 
            String serverMessage = "Nouveau utilisateur connecte: " + userName;
            server.broadcast(serverMessage, this);
 
            String clientMessage;
 
//            do {
            while(true) {
                clientMessage = reader.readLine();
                serverMessage = "--Utilisateur " + userName + "--: " + clientMessage;
                server.broadcast(serverMessage, this);
 
            }
//            } while (!clientMessage.equals("bye"));
 
//            server.removeUser(userName, this);
//            socket.close();
 
//            serverMessage = userName + " has quitted.";
//            server.broadcast(serverMessage, this);
 
        } catch (IOException ex) {
            System.out.println("Erreur: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    void printUsers() {
        if (server.hasUsers()) {
            writer.println(server.getUserNames());
        } else {
            writer.println("Vous etes le premier a se connecter");
        }
    }
 
    void sendMessage(String message) {
        writer.println(message);
    }
    
    
}