import java.util.Scanner;

public class Main {

    public static String replaceAll(String text, String find, String replacement) {

        int L1 = text.length();
        int L2 = find.length();

        String newText = "";

        for (int i = 0; i < L1;)
        {
            if ( i <= L1 - L2 && text.substring(i, i + L2).equals(find))
            {
                newText += replacement;
                i += L2;
            }
            else
            {
                newText += text.charAt(i);
                i += 1;
            }
        }
        return newText;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chaine;
        String char1;
        String char2;

        System.out.print("Entrer votre chaine : ");
        chaine = scanner.nextLine();
        System.out.print(" entre char2 a remplacer : ");
        char2 = scanner.next();
        System.out.print("entrer char1 avec quoi voulez vous remplacer : ");
        char1 = scanner.next();


        String newText = replaceAll(chaine, char2, char1);

        System.out.println("Avant rempalcement : " + chaine);
        System.out.println("Apres remplacement:  " + newText);

    }

}