
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Veuillez saisir votre chaine");
        String chaine=sc.next();
        System.out.println("Veuillez saisir le caractere a remplacer");
        char char1=sc.next().charAt(0);
        System.out.println("Veuillez saisir le caractere remplacant");
        char char2=sc.next().charAt(0);
        System.out.println(chaine.replace(char1, char2));
        System.out.println(chaine);
        if(sc!=null) {
            sc.close();
        }
    }
}
