import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compte> cmp =new ArrayList<>();
        int choix=0;
        int taille=0;
        Scanner sc =new Scanner(System.in);

        while(choix!=4){

            System.out.println("menu");
            System.out.println("ajouter compte:1");
            System.out.println("afficher tous les comptes 2");
            System.out.println("afficher les comptes superieur ou egale a 9000");
            System.out.println("quitter");
            System.out.println("Veuillez selectionner un choix");
            choix=sc.nextInt();
            switch (choix){
                case 1:
                    System.out.println("Saisir le nbr de compte a ajouter");

                    taille =sc.nextInt();
                    for(int i=0;i<taille;i++){
                        System.out.println("Remplir les info");
                        System.out.println("Saisir le num de compte");
                        int nocmp = sc.nextInt();
                        System.out.println("Saisir le titulaire");
                        String tit=sc.next();
                        System.out.println("Saisir le solde");
                        double solde = sc.nextDouble();
                        System.out.println("Merci");
                        Compte c =new Compte(nocmp,tit,solde);
                        cmp.add(c);

                    }
                    break;
                case 2:
                    System.out.println("La liste de tous les compte");
                    for(int i=0;i<taille;i++){
                        System.out.println(cmp.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("La liste de tous les compte sup a 9000");
                    for(int i=0;i<taille;i++){
                        if(cmp.get(i).getSolde()>=9000)
                        System.out.println(cmp.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("Merci et a bientot");
                    break;
                default:
                    System.out.println("Veullez saisir un choix valide");
            }
        }
    }
}