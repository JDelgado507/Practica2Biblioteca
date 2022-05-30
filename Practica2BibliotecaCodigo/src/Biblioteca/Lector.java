package Biblioteca;


import java.util.List;

public class Lector {

    private String dni;

    private List idPrestamo;

    private int numeroMaximoPrestamo;

    private String nom;

    public Lector(String dni, List idPrestamo, int numeroMaximoPrestamo, String nom) {
        this.dni = dni;
        this.idPrestamo = idPrestamo;
        this.numeroMaximoPrestamo = numeroMaximoPrestamo;
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(List idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getNumeroMaximoPrestamo() {
        return numeroMaximoPrestamo;
    }

    public void setNumeroMaximoPrestamo(int numeroMaximoPrestamo) {
        this.numeroMaximoPrestamo = numeroMaximoPrestamo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

}
