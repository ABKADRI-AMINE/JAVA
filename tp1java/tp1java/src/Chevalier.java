public class Chevalier extends Personnage{

    @Override
    public void combattre() {
        super.setArme(new ComportementPoignard());
        if (this.score > 10) {
            super.setArme(new ComportementArcetFleches());
            System.out.println("le Chevalier: " + arme.utiliserArme());
        } else {
            System.out.println("le Chevalier: " + this.arme.utiliserArme());
            this.score = this.score + 4;
        }

    }
}
