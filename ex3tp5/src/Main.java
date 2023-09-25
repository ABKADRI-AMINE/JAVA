
public class Main {

    public static void main(String[] args) {
        //ouvrir la connection
        ex3ecole.connect();
        //affichage des étudiants d'une filière.
        System.out.println("les etudiants de la filiere 1 sont: ");
        ex3ecole.afficheretudfilier(1);
        System.out.println("#########");
        //affichage de l'ensemble des étudiants
        System.out.println("tous les etudiants sont: ");
        ex3ecole.afficheralletud();
        System.out.println("#########");

        //modification du prénom d'un étudiant.
        System.out.println("modification du prénom du etudiant ");
        ex3ecole.modifpren(1,"ihab");
        System.out.println("#########");
        ex3ecole.afficheralletud();
        System.out.println("#########");

        //Ajouter un nouvel etudiant
        System.out.println("Ajouter un nouvel etudiant dans la filiere 2");
        ex3ecole.ajoutetud("JAWADI","Achraf",2);
        System.out.println("#########");
        ex3ecole.afficheralletud();
        System.out.println("#########");

        //Supprimer etudiant
        System.out.println("Supprimer etudiant 4 (fahd)");
        ex3ecole.suppetud(4);
        System.out.println("#########");
        ex3ecole.afficheralletud();
        System.out.println("#########");
    }

}