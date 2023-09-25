import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Saisir votre chaine de caractere!");
        Scanner sc = new Scanner(System.in);
        String chaine = sc.nextLine();
        System.out.println(chaine.length());
        System.out.println(chaine.substring(0,1).toUpperCase()+chaine.substring(1,chaine.length()).toLowerCase());

    }
}