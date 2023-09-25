public class utilisateur extends Personne{
    private String login;
    private String password;
    public utilisateur(){

    }


    public utilisateur(int id, String nomComplet, double salaire, String login, String password) {
        super(id, nomComplet, salaire);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "utilisateur{" +
                "id=" + getId() +
                ", nomComplet='" + getNomComplet() + '\'' +
                ", salaire=" + getSalaire() +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
