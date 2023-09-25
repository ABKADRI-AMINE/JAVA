public class Reine extends  Personnage {
    @Override
    public void combattre() {
        super.setArme(new ComportementArcetFleches());
        score= score+4;
        if (score > 10) {
            super.setArme(new ComportementHache());
            System.out.println("la reine : " + this.arme.utiliserArme());
        } else {
            System.out.println("la reine : " + this.arme.utiliserArme());

        }
    }
}