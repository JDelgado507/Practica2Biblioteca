package Biblioteca;


import java.util.ArrayList;

public class Llibres {

    private String Nom;

    private String editorial;

    private int any;

    private String autor;

    private ArrayList tipus;

    public Llibres(String Nom, String editorial, int any, String autor, ArrayList tipus) {
        this.Nom = Nom;
        this.editorial = editorial;
        this.any = any;
        this.autor = autor;
        this.tipus = tipus;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList getTipus() {
        return tipus;
    }

    public void setTipus(ArrayList tipus) {
        this.tipus = tipus;
    }
    
    
}
