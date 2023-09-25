
public class Roi extends Personnage {


    @Override
    public void combattre() {
        System.out.println("roi"+' '+arme.utiliserArme());
    }
}
