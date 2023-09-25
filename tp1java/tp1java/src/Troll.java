public class Troll extends Personnage{

    @Override
    public void combattre() {
        super.setArme(new ComportementArcetFleches());
        if (score > 10) {
            super.setArme(new ComportementPoignard());
            System.out.println("le Troll : "+this.arme.utiliserArme());
        } else {
            System.out.println("le Troll : "+this.arme.utiliserArme());
            score= score+4;
        }

    }
}
