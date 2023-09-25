

public class TestForm {
    public static void main(String[] args) {
        Forme[] figures = new Forme[3];
        figures[0] = new rectangle(5,3);
        figures[1] = new carre(8.2);
        figures[2] = new cercle(4.1);
        for (Forme fo:figures) {
            System.out.println(fo + "[ Surface : " + fo.getSurface() + " cm2 ]");
        }
    }
}