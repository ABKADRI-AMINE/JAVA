import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utilisateur user1  =new Utilisateur(1,"amine abkadri",90000,"amine12","amine12");
        Utilisateur user2 =new Utilisateur(2,"amine abk",900000,"amine19","amine19");
        Utilisateur user3 =new Utilisateur(3,"amine abkdr",95000,"amine20","amine20");
        Utilisateur user4 =new Utilisateur(3,"amine abkdri",95000,"amine21","amine21");
        Utilisateur[] tabUser = {user1,user2,user3,user4};
        Scanner sc = new Scanner(System.in);
        System.out.println(" login: ");
        String login= sc.nextLine();
        System.out.println(" password :");
        String psswd= sc.nextLine();
        sc.close();
        boolean Authentif = false;
        for (int i = 0; i < tabUser.length; i++) {
            if (login.equals(tabUser[i].getLogin()) && psswd.equals(tabUser[i].getPassword())) {
                Authentif = true;
                System.out.println("Authentification réussie :)");
                tabUser[i].AfficheUtilisateur();
                break;
            }
        }
        if (!Authentif) {
            System.out.println("Echec d'authentification ( : !");
        }
    }
}