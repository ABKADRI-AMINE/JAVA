package ma.ac.ensate.tp;



public class Test {
    public static void main(String[] args) {
        Etudiant etud1 = new Etudiant();
        Etudiant etud2 = new Etudiant("ayman");
        Etudiant etud3 = new Etudiant(1939,"yasser","HILAL");
        etud1.Remplir();
        etud2.Remplir1();
        Etudiant etud4 = new Etudiant(1940,"walid","oulako");
        System.out.println(etud4.toString());
        //instancier le constructeur par copie
        Etudiant etudparcopie = new Etudiant(etud4);


    }
}
