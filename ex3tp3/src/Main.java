import java.util.Scanner;

public class Main {

    public static void chaine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre chaine de caractere!");
        String chaine = sc.nextLine();
        System.out.println("la taille de la chaine est: " + chaine.length());
        int n= chaine.length();
        System.out.print(chaine.substring(0,1).toUpperCase());
        System.out.println(chaine.substring(1,n).toLowerCase());
    }

    public static void main(String[] args) {
        chaine();
    }
}