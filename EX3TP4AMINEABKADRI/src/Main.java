public class Main {
    public static void main(String[] args) {
        Employe[] subord = new Employe[2];
        subord[0] = new Employe("ahmed",1,1,222);
        subord[1]= new Employe("jawadi",2,2,222);
        Responsables amine = new Responsables("amine abkadri ",1,1,222,subord);
        amine.affichersubdirect();
//        ######################
        Employe[] subrd =new Employe[1];
        subrd[0] = new Employe("said",3,3,222);
        Responsables amineabk = new Responsables("amine abk ", 2,2,222,subrd);
        amineabk.affichersubdirect();
//        ######################
        commercial cm1 = new commercial("saad ", 2,4,222,100);
        System.out.println(cm1.affichsal());

        personnel per1 = new personnel();
        per1.ajouteremp();
    }
}