public abstract class Personnage {
   protected ComportementArme arme;
   public abstract void combattre();
   protected int score=0;
   protected void setArme(ComportementArme arme) {
      this.arme = arme;
   }
}
