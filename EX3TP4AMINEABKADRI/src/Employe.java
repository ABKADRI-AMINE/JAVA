

public class Employe {
    private String nom;
    private int matricule;
    private int indicesalarial;
private  double valeuraug;
    public Employe(String nom, int matricule, int indicesalarial, double valeuraug) {
        this.nom = nom;
        this.matricule = matricule;
        this.indicesalarial = indicesalarial;
        this.valeuraug =valeuraug;
    }

    public String getNom() {
        return nom;
    }



    public int getMatricule() {
        return matricule;
    }



    public int getIndicesalarial() {
        return indicesalarial;
    }



    public double getValeuraug() {
        return valeuraug;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setIndicesalarial(int indicesalarial) {
        this.indicesalarial = indicesalarial;
    }

    public void setValeuraug(double valeuraug) {
        this.valeuraug = valeuraug;
    }

    public double calculsalair(){
        return indicesalarial * valeuraug;
    }

    public String affichersal() {
        return "Employe{" +
                "nom='" +nom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", indicesalarial=" + indicesalarial  +
                ", valeuraug=" + valeuraug  +
                ", Salaire=" + calculsalair() +
                '}';
    }
}
