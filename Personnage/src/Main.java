public class Main {
    public static void main(String[] args) {
        Roi r = new Roi();
        r.setArme(new ComportementHach());
        r.combattre();
    }
}