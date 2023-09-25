package client;
import java.util.Scanner;

public class client3 {
	static Scanner  sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("entrer le hostname");
//    	String hostname = sc.nextLine();
//        System.out.println("entrer le port");
//        int port = sc.nextInt();
 
        client client = new client("localhost", 1000);
        client.execute();

	}

}
