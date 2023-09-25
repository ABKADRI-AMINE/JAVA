

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase");
        String phrase=sc.nextLine();
        String[] T=phrase.split(" ");
        System.out.println("nombre de mots: "+T.length);
        System.out.println("nombre de caractere tenant compte des espaces : "+ phrase.length());
        System.out.println("nombre de caractere tenant compte des espaces : "+ (phrase.length()-(T.length-1)));


    }

}
