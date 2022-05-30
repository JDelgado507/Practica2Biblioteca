package Biblioteca;

public class Autor {

    private String nom;

    private String nacionalitat;

    private String dataNaixement;

    public Autor(String nom, String nacionalitat, String dataNaixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }
    
    
}
