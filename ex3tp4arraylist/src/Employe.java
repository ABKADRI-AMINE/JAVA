public class Employe {
    private String nom;
    private int matricule;
    private int indicesala;
    private int valeuraug;

    public Employe(String nom, int matricule, int indicesala, int valeuraug) {
        this.nom = nom;
        this.matricule = matricule;
        this.indicesala = indicesala;
        this.valeuraug = valeuraug;
    }
    public double calculsalair(){
        double salaire = this.valeuraug*this.indicesala;
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getIndicesala() {
        return indicesala;
    }

    public int getValeuraug() {
        return valeuraug;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", matricule=" + matricule +
                ", indicesala=" + indicesala +
                ", valeuraug=" + valeuraug +
                ", Salaire=" + calculsalair() +
                '}';
    }
}
