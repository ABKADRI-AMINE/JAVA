package ma.ac.ensate.tp;

public class sexagesiamuxdecimux {
    private int heures;
    private int minutes;
    private int secondes;
    private double durre;

    public sexagesiamuxdecimux(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public sexagesiamuxdecimux(double durre) {
        this.durre = durre;
    }

    public void getDec() {
        if (this.durre!=0){
            this.durre= durre;
        }else{
            this.durre = this.heures + (double)(this.minutes) / 60 + (double)(this.secondes) / 3600;
            System.out.println("Votre durre en  decimales est: " + this.durre + " heures");
        }}

    public int getHeures() {

        if (this.heures != 0) {
            return this.heures;
        } else {
            this.heures = (int) this.durre;
            return heures;
        }
    }

    public int getMinutes() {if (this.minutes != 0) {
        return this.minutes;
    }else{
        this.minutes = (int) ((this.durre - this.heures) * 60);
        return minutes;}
    }

    public int getSecondes() { if (this.secondes != 0) {
        return this.secondes;
    }else{
        this.secondes = (int) ((((this.durre - this.heures) * 60) - this.minutes) * 60);
        return secondes;}
    }
}
