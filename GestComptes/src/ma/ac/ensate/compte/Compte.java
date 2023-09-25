package ma.ac.ensate.compte;
import java.util.Date;
public class Compte {
    public int noCompte;
    public String titulaire;
    public double solde;
//Const par defaut
    public Compte(){

    }

    //Constr d'initialisation
    public  Compte(int noCompte,String titulaire,double solde){
        this.noCompte = noCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }
    void deposer(int montant) {
        solde=solde+montant;
    }

    public void retirer(double montant) throws Exception{
        if(this.solde >= montant){
            this.solde = this.solde- montant;
        }
        else{
            throw new Exception("Votre solde est insiffusant!");
        }
    }
    public void virerVers(int montant,Compte destination) throws Exception{
        if(this.solde>= montant){
            destination.deposer(montant);}
        else{
            throw new Exception("Votre solde est insiffusant desole on ne peut pas faire le virement!");
        }
    }
    public String toString(){
        Date date = new Date();
        return "Compte [ No : " + this.noCompte + ", Titulaire : " + this.titulaire + ", Solde au " + date + " : " + this.solde +"]";
    }

    public static void main(String[] args) {
        Compte cmpt1 = new Compte(19,"AMINE ABKADRI",1000);
        try{
            cmpt1.retirer(100);
        }
        catch (Exception erreur){
            System.out.println(erreur);
        }
        System.out.println(cmpt1.toString());
        Compte cmpt2 = new Compte(20,"AMINE hilal",800);
        try{
            cmpt2.virerVers(1000,cmpt1);
        } catch (Exception err){
            System.out.println(err);
        }
        System.out.println(cmpt1.toString());
        System.out.println(cmpt2.toString());
    }
}
