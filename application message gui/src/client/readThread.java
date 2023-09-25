package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class readThread extends Thread {
    private BufferedReader reader;
    private Socket socket;
    private client client;
 
    public readThread(Socket socket, client client) {
        this.socket = socket;
        this.client = client;
 
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            System.out.println("Erreur: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public void show_mes_server(String sever_msg) {
        if(sever_msg.charAt(0)=='[') {
        	System.out.println("users : "+sever_msg);
        	 char[] ch = new char[sever_msg.length()];
             for (int i=0; i < sever_msg.length()-2; i++) {
                 ch[i] = sever_msg.charAt(i+1);
             }              
             String chaine=Character.toString(ch[0]);
             for (int i=1; i<sever_msg.length(); i++) {
            	 chaine=chaine+ch[i];
             }
        	String[] users=chaine.split(",");
        	for(int i=0;i<users.length;i++) {
        		System.out.println(users[i]);
        	}
        }else {
        System.out.println("\n" + sever_msg);
        }
    }
    
    public void run() {
        while (true) {
            try {
                String response = reader.readLine();
                show_mes_server(response); 
                // prints the username after displaying the server's message
                if (client.getUserName() != null) {
                    System.out.print("--Utilisateur " + client.getUserName() + "--: ");
                }
            } catch (IOException ex) {
                System.out.println("Erreur: " + ex.getMessage());
                ex.printStackTrace();
                break;
            }
        }
    }
}