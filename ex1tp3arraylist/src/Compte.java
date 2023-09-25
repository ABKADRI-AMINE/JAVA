public class Compte {
        private int noCompte;
        private String titulaire;
        private double solde;
        int nocpm;

        public Compte(){

        }

        public double getSolde() {
            return solde;
        }

        public Compte(int noCompte, String titulaire, double solde) {
            this.noCompte = noCompte;
            this.titulaire = titulaire;
            this.solde = solde;
        }

    @Override
    public String toString() {
        return "GestComptes{" +
                "noCompte=" + noCompte +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }

}


