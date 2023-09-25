
import java.util.Scanner;

        public class Main {

            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Saisir la chaîne: ");

                // Saisie de la chaîne par l'utilisateur
                String str = sc.nextLine();

                System.out.println("Saisir char1: ");

                // Saisie de caractère char1
                char char1 = sc.next().charAt(0);
                System.out.println(str);
    }
}