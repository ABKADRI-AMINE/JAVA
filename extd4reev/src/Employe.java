public class Employe {
    private String nom;
    private int indicesala;
    private int matricule;
    private int valeuraug;

    public Employe(String nom, int indicesala, int matricule, int valeuraug) {
        this.nom = nom;
        this.indicesala = indicesala;
        this.matricule = matricule;
        this.valeuraug = valeuraug;
    }
    public double calculsal(){
        double salaire= this.indicesala*this.valeuraug;
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public int getIndicesala() {
        return indicesala;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getValeuraug() {
        return valeuraug;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", indicesala=" + indicesala +
                ", matricule=" + matricule +
                ", valeuraug=" + valeuraug +
                ",salaire="+calculsal()+
                '}';
    }
}
