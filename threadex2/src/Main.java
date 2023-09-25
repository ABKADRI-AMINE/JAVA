
public class Main {
    public static void main(String[] args) {
        Compte compte = new Compte(0);

        Thread[] threads = new Thread[40];

        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new ThreadVerser(compte, 10));
            threads[i + 20] = new Thread(new ThreadRetirer(compte, 10));
        }

        for (Thread t : threads) {
            t.start();
        }

        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("le solde final est : " + compte.consulter());

    }
}
