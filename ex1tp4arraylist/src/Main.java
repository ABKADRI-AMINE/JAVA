import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        utilisateur t1= new utilisateur(1,"amineabk",2000,"amine@gmail.com","amine19");
        utilisateur t2= new utilisateur(1,"amineabk",2000,"ame@gmail.com","amine1");
        utilisateur []tab = {t1,t2};
        Scanner sc =new Scanner(System.in);
        System.out.println("Saisir login");
        String login=sc.nextLine();
        System.out.println("Saisir password");
        String paswd=sc.nextLine();
        Boolean isauthen =false;
        for(int i=0;i< tab.length;i++){
            if(tab[i].getLogin().equals(login)&& tab[i].getPassword().equals(paswd)&& isauthen==false){
                System.out.println("Authentif reussie");
                tab[i].toString();
                isauthen=!isauthen;
            }            else{
                System.out.println("Authetification failed");
            }

        }
    }
}