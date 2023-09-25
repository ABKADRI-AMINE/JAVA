public class chevalier extends Personnage {


    @Override
    public void combattre() {
        System.out.println("chevalier"+' '+arme.utiliserArme());
    }
}
