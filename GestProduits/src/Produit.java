public class Produit {
    private long id;

    public Produit(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String imprimer() {
        return "<<Produit[ " +
                "ID: " + id +
                "]";
    }
}
