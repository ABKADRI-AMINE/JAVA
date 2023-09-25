package ma.ac.ensate.tp;

public class Test {
    public static void main(String[] args) {
        sexagesiamuxdecimux durr = new sexagesiamuxdecimux(5, 33, 30);
        durr.getDec();


        sexagesiamuxdecimux segi = new sexagesiamuxdecimux(19.141);
        int c = segi.getHeures();
        System.out.println("Votre durre contient " + c + " heures");

        int d = segi.getMinutes();
        System.out.println("Votre durre contient " + d + " minutes");

        int e = segi.getSecondes();
        System.out.println("Votre durre contient " + e + " secondes");
    }
}
