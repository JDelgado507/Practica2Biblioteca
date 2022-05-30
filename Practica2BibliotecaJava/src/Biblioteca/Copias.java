package Biblioteca;


import java.util.ArrayList;

public class Copias extends Llibres {

    private String identificador;

    private String Estado;

    public Copias(String Nom, String editorial, int any, String autor, ArrayList tipus) {
        super(Nom, editorial, any, autor, tipus);
    }

 

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
