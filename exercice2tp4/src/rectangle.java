public class rectangle extends Forme{
    double longeur;
    double largeur;
    public rectangle(double longeur, double largeur){
        this.longeur = longeur;
        this.largeur = largeur;
    }
    public double getSurface(){
        return longeur * largeur;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "longeur=" + longeur +
                ", largeur=" + largeur +
                '}';
    }
}
