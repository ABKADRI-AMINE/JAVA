
import java.awt.Color;
import java.io.*;

import java.net.*;

import javax.swing.JLabel;
 
public class serveurThread extends Thread {
    private Socket socket;
    private serveur server;
    
    //private PrintWriter writer;
    private ObjectOutputStream writer;
 
    public serveurThread(Socket socket, serveur server) {
        this.socket = socket;
        this.server = server;
    }
 
    public void run() {
        try {
            
            ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());

             writer = new ObjectOutputStream(socket.getOutputStream());

                                
            String tableUser=server.getUserNames().toString();
            //if(tableUser!=null)server.broadcast(tableUser, this);
            //printUsers();
 
            String[] object = {"amine"};
            try {
                 object = (String[]) reader.readObject();
            }catch (Exception ex) {
            System.out.println("Erreur: " + ex);
            }
            
            
            server.addUserName(object[0]);
            String serverMessage = "Nouveau utilisateur connecte: " + object[0];
            String[] serveer = {serverMessage};
            server.broadcast(serveer, this);
 
            String[] msg = {"msg","ahmad"};
             
//            do {
            while(true) {
                
                try {
                msg = (String[]) reader.readObject();
            }catch (Exception ex) {
            System.out.println("Erreur: " + ex);
            }
                
                //clientMessage = reader.readLine();
               
                //serverMessage = "<html><strong style=\"font-weight:800;\">" + object[0] + " :</strong> " + msg[0]+"</html>";
                String[] serveer1 = {object[0],msg[0]};
                server.broadcast(serveer1, this);
 
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
 /*
    void printUsers() {
        if (server.hasUsers()) {
            writer.println(server.getUserNames());
        } else {
            writer.println("Vous etes le premier a se connecter");
        }
    }*/
 
    void sendMessage(Object message) {
        try {
                 writer.writeObject(message);
            }catch (IOException ex) {
            System.out.println("Erreur: " + ex);
            }
         
    }
    
    
}