public class commerciaux extends Employe{
    private double vente;

    public commerciaux(String nom, int matricule, int indicesala, int valeuraug, double vente) {
        super(nom, matricule, indicesala, valeuraug);
        this.vente = vente;
    }

    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }
    public double calculsalaire(){
        double salaire= (getIndicesala()*getValeuraug())+(this.vente/10);
    return salaire;
    }
    public String toStringg() {
        return "Commercial{" +
                "nom='" + getNom() + '\'' +
                ", matricule=" + getMatricule() +
                ", indicesala=" + getIndicesala() +
                ", valeuraug=" + getValeuraug() +
                ", Salaire=" + calculsalaire() +
                '}';
    }
}
