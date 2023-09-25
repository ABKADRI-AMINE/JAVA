public class Commercial extends Employe {
private double vente;

    public Commercial(String nom, int indicesala, int matricule, int valeuraug, double vente) {
        super(nom, indicesala, matricule, valeuraug);
        this.vente = vente;
    }
    public double calculsal(){
        double salaire = + (this.vente)/10;
        return salaire;
    }

    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "nom='" + getNom() + '\'' +
                ", indicesala=" + getIndicesala() +
                ", matricule=" + getMatricule() +
                ", valeuraug=" + getValeuraug() +
                ",salaire="+this.calculsal()+
                '}';
    }
}
