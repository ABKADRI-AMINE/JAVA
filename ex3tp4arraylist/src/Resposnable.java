import java.util.ArrayList;

public class Resposnable extends Employe{
    ArrayList<Employe> suborderesp = new ArrayList<>();

    public Resposnable(String nom, int matricule, int indicesala, int valeuraug, ArrayList<Employe> suborderesp) {
        super(nom, matricule, indicesala, valeuraug);
        this.suborderesp = suborderesp;
    }

    public void affichersubor(){
        for(Employe sub:suborderesp){
            System.out.println("Les inferieure direct du responsable "+getNom()+" sont:");
            System.out.println(sub.toString());
        }
    }
    public void afficheSubordonéIndirectEtDirecte(){
        System.out.println("Affichage de tous les subordones");
        for (Employe e:this.suborderesp) {
            System.out.println(e.toString());
            if(e instanceof Resposnable){
                for (Employe e1:((Resposnable) e).suborderesp) {
                    System.out.println(e1.toString());
                }
            }
        }
    }
}
