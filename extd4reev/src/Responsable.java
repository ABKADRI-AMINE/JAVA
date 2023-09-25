import java.util.ArrayList;

public class Responsable extends Employe{
  ArrayList<Employe> inf = new ArrayList<Employe>();

    public Responsable(String nom, int indicesala, int matricule, int valeuraug, ArrayList<Employe> inf) {
        super(nom, indicesala, matricule, valeuraug);
        this.inf = inf;
    }

    public ArrayList<Employe> getInf() {
        return inf;
    }
    public void afficheinfdirect(){
        for(Employe infd:inf){
            System.out.println(infd.toString());
        }
    }
}
