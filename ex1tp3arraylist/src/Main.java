import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compte> Cmp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while(choix != 4){
            System.out.println("Menu:");
            System.out.println("Saisir votre choix:");
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Afficher tous les comptes");
            System.out.println("3. Afficher les comptes sup a 10000");
            System.out.println("4. Quitter !");
            choix = sc.nextInt();

            switch(choix){
                case 1:
                    System.out.print("Entrer le nombre de comptes a ajouter : ");
                    int nombre = sc.nextInt();
                    for(int i=0;i<nombre;i++){
                        System.out.println("Entrer les informations du compte numero "+(i+1)+" : ");
                    System.out.println("Saisir le numero du compte ");
                    int numeroCompte = sc.nextInt();
                    System.out.println("Saisir le titulaire: ");
                    String titulaire = sc.next();
                    System.out.println("Saisir  le solde: ");
                    double solde = sc.nextDouble();
                    Compte c = new Compte(numeroCompte, titulaire,solde);
                    Cmp.add(c);
                        System.out.println("Compte ajouté avec succès !");}
                    break;

                case 2:
                    System.out.println("Liste des comptes : ");
                    for(int i=0;i<Cmp.size();i++){
                        System.out.println(Cmp.get(i).toString());}
                    break;

                case 3:
                    for(int i=0;i<Cmp.size();i++){
                        if(Cmp.get(i).getSolde() > 10000){
                            System.out.println(Cmp.get(i).toString());
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Merci et a bientot!");
                    break;

                default:
                    System.out.println("Veuillez saisir un choix valide!");
                    break;
            }
        }
    }
}