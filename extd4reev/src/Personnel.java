import java.util.ArrayList;

public class Personnel {
ArrayList<Employe> pers = new ArrayList<Employe>();

    public Personnel(ArrayList<Employe> pers) {
        this.pers = pers;
    }
     public void addemp(Employe e){
        pers.add(e);
     }
     public void afficheremp(){
        for(Employe em:pers){
            System.out.println(em.toString());
        }
     }
     public double affichsommesal(){
       double somme = 0;
        for(Employe em1:pers){
            somme=+em1.calculsal();
        }
     }
}
