public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getSurface() {
        return this.longueur * this.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + this.longueur +
                ", largeur=" + this.largeur +
                '}';
    }

}
