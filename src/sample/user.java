package sample;

public class user {
    private String nom;
    private String prenom;
    private String password;


    public user (String nom, String prenom, String password) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



}

