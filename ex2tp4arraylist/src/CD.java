

public class CD extends Produit {
    private String titre;
    private String auteur;
    private double prix;

    public CD(long id, String titre, String auteur, double prix) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    @Override
    public String imprimer() {
        return "CD{" +
                "id='" + this.getId() + '\'' +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                '}';
    }
}
