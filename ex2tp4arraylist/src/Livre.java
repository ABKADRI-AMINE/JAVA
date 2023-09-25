

public class Livre extends Produit {
    private String titre;
    private String auteur;
    private String isbn;

    public Livre(long id, String titre, String auteur, String isbn) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    @Override
    public String imprimer() {
        return "Livre{" +
                "id='" + this.getId() + '\'' +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
