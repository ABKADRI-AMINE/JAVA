public class cd extends Produit{
    private String titre;
    private String auteur;
    private double prix;

    public cd(long id, String titre, String auteur, double prix) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String imprimer() {
        return "cd{" +
                "ID: " + this.getId() +
                " titre='" + titre + '\'' +" de "+
                ", auteur='" + auteur + '\'' +
                ",pour un prix exeptionel de ='" + prix +" $ "+ '\'' +
                '}';
    }
}
