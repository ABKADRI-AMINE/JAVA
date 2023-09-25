import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Saisir votre chaine");
        Scanner sc =new Scanner(System.in);
        String chain =sc.nextLine();
        System.out.println(chain.length());
        System.out.println(chain.substring(0,1).toUpperCase()+chain.substring(1,chain.length()).toLowerCase());
    }
}