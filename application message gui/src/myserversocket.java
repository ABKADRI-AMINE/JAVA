import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;
import java.net.*;
import java.nio.*;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
public class myserversocket {
    
     
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        String filename = "salut";
        
            try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException ex) {
            System.out.println("Can't setup server on this port number. ");
        }
while(true){
        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;
        
        try {
            socket = serverSocket.accept();
        } catch (IOException ex) {
            System.out.println("Can't accept client connection. ");
        }
        
        try {
            in = socket.getInputStream();
            DataInputStream d = new DataInputStream(in);
            filename = d.readUTF();
             System.out.println("File name. "+filename);
        } catch (IOException ex) {
            System.out.println("Can't get socket input stream. ");
        }

        try {
            
            out = new FileOutputStream("output/"+filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. ");
        }
        System.out.println("Reading: " + System.currentTimeMillis());

        byte[] bytes = new byte[16*1024];

        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }
      }
       

        
    }
}
