import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Personne {
    private int id;
    private String cin;
    private String nom;
    private String prenom;
    private char genre;
    private LocalDate dateNaissance;
    public Personne(){}

    public Personne(int id, String cin, String nom, String prenom, char genre, LocalDate dateNaissance) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.dateNaissance = dateNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int calcAge() {
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dateNaissance,today);
    }

    public String toString() {
        if(this.genre=='M'){
        System.out.println("M." +
                ", cin='" + cin + '\'' +
                ", nom='" + nom.toUpperCase() + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance+
                ", Age=" + calcAge()
        );
    }
     else if (this.genre=='F'){
            System.out.println("Mme." +
                    ", cin='" + cin + '\'' +
                    ", nom='" + nom.toUpperCase() + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", dateNaissance=" + dateNaissance+
                    ", Age=" + calcAge()
            );
        }
   else {
            System.out.println("{" +
                    ", cin='" + cin + '\'' +
                    ", nom='" + nom.toUpperCase() + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", dateNaissance=" + dateNaissance+
                    ", Age=" + calcAge()
            );
        }
   return "{" +
           ", cin='" + cin + '\'' +
           ", nom='" + nom.toUpperCase() + '\'' +
           ", prenom='" + prenom + '\'' +
           ", dateNaissance=" + dateNaissance+
           ", Age=" + calcAge();
    }

}
