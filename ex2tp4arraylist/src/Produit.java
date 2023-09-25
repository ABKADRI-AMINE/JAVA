

public class Produit {
    private long id;

    public Produit(long id) {
        this.id = id;
    }

    public String imprimer() {
        return "Produit{" +
                "id=" + id +
                '}';
    }

    public long getId() {
        return id;
    }
}
