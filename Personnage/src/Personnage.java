public abstract class Personnage {
    protected ComportementArme arme;

    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }

    public abstract void combattre();
}
