public class Responsables extends  Employe{
    private Employe[] subordonnés;

    public Responsables(String nom, int matricule, int indicesalarial, double valeuraug, Employe[] subordonnés) {
        super(nom, matricule, indicesalarial, valeuraug);
        this.subordonnés = subordonnés;
    }
    public Employe[] getSubordonnés() {
        return subordonnés;
    }
    public void affichersubdirect() {
        System.out.println("les subordonnes direct de  " + this.getNom() + "sont:");
        for (Employe sub : subordonnés) {
            System.out.println(sub.affichersal());
        }
    }

}
