import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.net.*;
import java.nio.*;
public class myclientsocket {
    //public static void main(String[] args) throws IOException {
    public static String pathss;
   public void send_file_socket(String path){
       try {
                Socket socket = null;
        String host = "127.0.0.1";

        socket = new Socket(host, 4444);
        
        File file = new File(path);  
        // Get the size of the file
        String fileName = file.getName();
        System.out.println("name: " + fileName);
        System.out.println("Flushed: " + System.currentTimeMillis());
        
        long length = file.length();
        byte[] bytes = new byte[16 * 1024];
        
        InputStream in = new FileInputStream(file);
        OutputStream out = socket.getOutputStream();
        DataOutputStream d = new DataOutputStream(out);
        d.writeUTF(file.getName());
        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }

        out.close();
        in.close();
        socket.close();
       } catch(Exception e ){
           System.out.println("error"+e);
       }
    }

    //}
}
