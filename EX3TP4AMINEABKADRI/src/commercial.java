public class commercial extends  Employe{
    private double vente;

    public commercial(String nom, int matricule, int indicesalarial, double valeuraug, double vente) {
        super(nom, matricule, indicesalarial, valeuraug);
        this.vente = vente;
    }
    @Override
    public double calculsalair(){
        return super.calculsalair()+(this.vente/10);
    }


    public String affichsal() {
        return "Commercial {" +
                "nom='" +super.getNom() + '\'' +
                ", matricule='" + super.getMatricule() + '\'' +
                ", indicesalarial=" + super.getIndicesalarial()  +
                ", valeuraug=" + super.getValeuraug()  +
                ", Salaire=" + calculsalair() +
                '}';
    }
}
