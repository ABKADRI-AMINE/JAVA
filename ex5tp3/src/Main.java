import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cmp =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir vote phrase");
        String str = sc.nextLine();
        String [] tab  = str.split("\\s+");
        System.out.println("le nombre de mot est : "+tab.length);
        System.out.println("le nombre de caractere avec espace est: "+str.length());
       char []tab1= str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(tab1[i] ==' ' ){
                cmp++;
            }
        }
        System.out.println("le nombre de caractere sans espace est: "+(str.length()-cmp));

    }
}