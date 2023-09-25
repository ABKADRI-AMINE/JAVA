import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employe emp1 = new Employe("AHMED",1,1,10);
        Employe emp2 = new Employe("Saad",1,1,10);
        Employe emp3 = new Employe("issam",1,1,10);
        System.out.println(emp1.toString());
        ArrayList<Employe> resp =new ArrayList<>();
        resp.add(emp1);
        ArrayList<Employe> resp1 =new ArrayList<>();

        Resposnable Resp1 = new Resposnable("amine",2,2,10,resp);
        resp1.add(Resp1);
        Resposnable Resp3 = new Resposnable("amine",2,2,10,resp1);
        Resp3.afficheSubordonéIndirectEtDirecte();
        Resposnable Resp2 = new Resposnable("zyad",2,2,10,resp);
        Resp1.affichersubor();
        commerciaux cm1= new commerciaux("ayoub",3,3,10,100);
        System.out.println(cm1.toStringg());
        ArrayList<Employe> pers =new ArrayList<>();
       personnel per1= new personnel(pers);
       per1.addemp(emp2);
        per1.addemp(emp3);
       per1.affichemp();
        System.out.println("Total de salaire  verser est: "+per1.calculsommsal());





    }
}