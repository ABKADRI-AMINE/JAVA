import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestion personnel entreprise de ABKADRI");
        Personne p1= new Personne(1,"CA1122","ALI","JAWADI",'M', LocalDate.parse("1960-11-15"));
        Personne p2= new Personne(2,"CA1213","MED","Mahmadi",'M', LocalDate.parse("1985-02-28"));
        Personne p3= new Personne(3,"BA2211","Mari","Redawi",'F', LocalDate.parse("2004-04-30"));
        p1.toString();
        p3.toString();
        try{
            Employe e1=new Employe(4,"CA2233","Ahmed","Fawzan",'M',LocalDate.parse("1997-01-30"),LocalDate.now(),2900.98);

        }
        catch(Exception e){e.printStackTrace();}
    }
}