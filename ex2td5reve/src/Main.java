import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Forme[ ] figures = new Forme[1] ;
        figures[0] = new Rectangle(5, 3) ; // Création d'un rectangle de 5 cm de longueur et de 3,5 cm de largeur
        for(Forme fo: figures) // for-each
            System.out.println(fo + " : Surface : " + fo.getSurface() + " cm2 ]") ;
    }
}
