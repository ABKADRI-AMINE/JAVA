public class cercle extends Forme{
    double rayon;
    public cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getSurface(){
        return Math.round(Math.PI * rayon * rayon);
    }

    @Override
    public String toString() {
        return "cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
