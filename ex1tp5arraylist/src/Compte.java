import java.util.Date;

public class Compte {
    private int noCompte;
    private String titulaire;
    private double solde;
    public Compte(){

    }

    public Compte(int noCompte, String titulaire, double solde) {
        this.noCompte = noCompte;
        this.titulaire = titulaire;
        this.solde = solde;
    }
    Date date = new Date();
    @Override
    public String toString() {
        return "Compte{" +
                "noCompte=" + noCompte +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                ", au date " + date +
                '}';
    }

    public void deposer(double montant){
        this.solde=this.solde+montant;
    }
    public void retirer(double montant) throws Exception{
        if(this.solde>montant){
            this.solde=this.solde-montant;
        }
        else{
            throw new Exception("Desole votre solde est insiffisant");
        }
    }
    public void virerVers(double montant,Compte destination) throws Exception{
        if(this.solde>montant){
            this.retirer(montant);
            destination.deposer(montant);

        }
        else{
            throw new Exception("Desole votre solde est insiffisant");
        }
    }

    public static void main(String[] args) {
        Compte cm1 = new Compte(1,"amin",100);
        Compte cm2 = new Compte(1,"amin",300);

        try{
            cm1.retirer(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            cm2.virerVers(200,cm1);

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(cm1.toString());

    }

    public int getNoCompte() {
        return noCompte;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDate() {
        return date;
    }
}
