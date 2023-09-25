import java.time.LocalDate;

public class Employe extends Personne{
    private LocalDate dateEmbauche;
    double salaire;

    public Employe(LocalDate dateEmbauche, double salaire) {
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public Employe(int id, String cin, String nom, String prenom, char genre, LocalDate dateNaissance, LocalDate dateEmbauche, double salaire) {
        super(id, cin, nom, prenom, genre, dateNaissance);
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }
    public Employe(int id, String cin, String nom, String prenom, char genre, LocalDate dateNaissance) throws Exception{
        super(id, cin, nom, prenom, genre, dateNaissance);
        if(this.calcAge()<18);
        throw new Exception ("l age au recrutement doit etre>=18 ans!");
    }

}
