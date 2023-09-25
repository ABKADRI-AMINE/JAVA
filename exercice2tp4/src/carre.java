public class carre extends Forme{
    double face;
    public  carre(double face){
        this.face = face;
    }
    public double getSurface(){
        return face*face;
    }

    @Override
    public String toString() {
        return "carre{" +
                "face=" + face +
                '}';
    }
}
