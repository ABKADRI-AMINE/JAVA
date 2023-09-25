package ma.ac.ensate.tp;

import java.util.Scanner;

public class Etudiant {
    private int Code;
    private String Nom;
    private String Prenom;
    //Constructeur par defaut
    public Etudiant (){
    }
    //Constructeur accepttant le parametre Nom
    public Etudiant(String Nom){
        this.Nom=Nom;
    }
    //Constructeur accepttant les 3 para
    public Etudiant(int Code,String Nom,String Prenom){
        this.Code = Code;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }
    //Constructeur par copie
    Etudiant (Etudiant E){
        this.Code = E.Code;
        this.Nom = E.Nom;
        this.Prenom = E.Prenom;
    }

    @Override
    public String toString() {
        return"L'etudiant dont le code est :"+Code+" son Nom est: "+Nom+" son Prenom est: "+Prenom;
    }

    public void Remplir(){
        System.out.println("Remplir les info");
        System.out.println("Saisir le nom");
        Scanner sc1 = new Scanner(System.in);
        this.Nom = sc1.nextLine();
        System.out.println("Saisir le code");
        Scanner sc = new Scanner(System.in);
        this.Code = sc.nextInt();

        System.out.println("Saisir le prenom");
        Scanner sc2 = new Scanner(System.in);
        this.Prenom = sc.next();
        System.out.println("L'etudiant dont le code est :"+Code+" son Nom est: "+Nom+" son Prenom est: "+Prenom);
    }
    public void Remplir1(){
        System.out.println("Remplir les info");
        System.out.println("Saisir le code");
        Scanner sc = new Scanner(System.in);
        this.Code = sc.nextInt();
        System.out.println("Saisir le prenom");
        Scanner sc2 = new Scanner(System.in);
        this.Prenom = sc.next();
        System.out.println("L'etudiant dont le code est :"+Code+" son Nom est: "+Nom+" son Prenom est: "+Prenom);
    }
}
