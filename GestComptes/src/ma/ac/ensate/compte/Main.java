package ma.ac.ensate.compte;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbrcpt;
        int noCmp;
        String titulair;
        double solde;
        char choix;
        Compte[]  tabCpt = new Compte[100];
        do {
            System.out.println(" a-- Ajouter un tableau de comptes: \n b-- Afficher tous les comptes: \n c-- Afficher les comptes dont le montant est sup a 9000: \n d-- Quitter: ");
            choix = sc.next().charAt(0);
            switch (choix) {
                case 'a' :
                    System.out.println("Entrer le nombre de compte a ajouter");
                    nbrcpt=sc.nextInt();
                    tabCpt = new Compte[nbrcpt];
                    for (int i = 0; i < nbrcpt; i++) {
                        System.out.println("Entrer les informations " + i);
                        System.out.println("Entrer le no du  compte");
                        noCmp=sc.nextInt();
                        System.out.println("Entrer le titulaire du compte");
                        titulair=sc.next();
                        System.out.println("Entrer le solde du compte");
                        solde=sc.nextDouble();
                        tabCpt[i] = new Compte(noCmp,titulair,solde);
                    }
                    break;
                case 'b' :
                    for (int i = 0; i < tabCpt.length; i++) {
                        System.out.println(tabCpt[i].toString());
                    }
                    break;
                case 'c' :
                    for (int i = 0; i < tabCpt.length; i++) {
                        if (tabCpt[i].solde >= 9000) {
                            System.out.println(tabCpt[i].toString());
                        }
                    }
                    break;
            }
        }while (choix != 'd');
    }
}
