
import java.net.*;
import java.io.*;
import java.util.*;

public class Server implements Runnable{
    
    Socket socket;
    static ObjectInputStream reader;
    static ObjectOutputStream bw;
    public static Vector client = new Vector();
    
    public Server(Socket socket){
        try{
            this.socket = socket;
        }catch(Exception e){}
    }
    
    
    public void run(){
        String msgin = "";
        try{
             reader = new ObjectInputStream(socket.getInputStream());
             bw = new ObjectOutputStream(socket.getOutputStream());
            
            client.add(bw);
            //System.out.println("hii "+client.toString());
            //client.toString();
            
            while(true){

                String[] object = (String[]) reader.readObject();
                System.out.println("Received : "+object[0]+" from "+object[1]);
                System.out.println("nbr utilsateur :"+client.size());
                for(int i = 0; i < client.size(); i++){
                 try{
                     System.out.println("saaalut 1");
                         bw = (ObjectOutputStream) client.get(i);
                        //bw.writeUTF(msgin);
                        System.out.println("saaalut 2");
                        bw.writeObject(object); 
                        bw.flush();
                        System.out.println("saaalut 3");
                        bw.flush();
                    }catch(Exception ee){
                       System.out.println(ee);
                    }
                   

                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args) throws Exception{
        ServerSocket s = new ServerSocket(2008);
        while(true){
            Socket socket = s.accept();
            Server server = new Server(socket);
            Thread thread = new Thread(server);
            thread.start();
        }
       
            
        } 
    
}
