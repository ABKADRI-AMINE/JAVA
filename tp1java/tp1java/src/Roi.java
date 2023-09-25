public class Roi extends Personnage {

    @Override
    public void combattre() {
        super.setArme(new ComportementHache());
        score = score + 4;
        if (score > 10) {
            super.setArme(new ComportementArcetFleches());
            System.out.println("le Roi : " + this.arme.utiliserArme());
        } else {
            System.out.println("le Roi : " + this.arme.utiliserArme());

        }

    }
}