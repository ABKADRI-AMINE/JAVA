import java.util.Scanner;

public class personnel {
    public personnel() {
    }

    public Employe[] ajouteremp() {
        Employe[] emp = new Employe[100];
        System.out.println("Saisir le nbr de employe a ajouter");
        Scanner s = new Scanner(System.in);
        int taille = s.nextInt();
        emp = new Employe[taille];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Saisir vos info du EMPLOYE");
            System.out.println("Saisir votre nom");
            String nom = s.nextLine();
            emp[i].setNom(nom);
            System.out.println("Saisir votre mat");
            int matricule = s.nextInt();
            emp[i].setMatricule(matricule);
            System.out.println("Saisir votre indicesalarial");
            int indic = s.nextInt();
            emp[i].setIndicesalarial(indic);
            System.out.println("Saisir votre valeur d'augmentation");
            double val = s.nextInt();
            emp[i].setValeuraug(val);
            System.out.println("Merci");

        }
        return emp;
    }
}