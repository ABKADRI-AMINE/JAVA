import java.util.ArrayList;

public class personnel {
    ArrayList<Employe> pers =new ArrayList<>();

    public personnel(ArrayList<Employe> pers) {
        this.pers = pers;
    }

    public void addemp(Employe e){
        pers.add(e);
    }

    public void affichemp(){
        System.out.println("la liste des employe ajoutee par personnel est");
        for(Employe emp:pers){
            System.out.println(emp.toString());
        }
    }
    public double calculsommsal(){
        double somme=0;
        for(Employe em:pers){
            somme=somme+em.calculsalair();
        }
        return somme;
    }

}
