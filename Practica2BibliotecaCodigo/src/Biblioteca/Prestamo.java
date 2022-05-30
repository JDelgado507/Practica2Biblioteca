package Biblioteca;

public class Prestamo {

    private int fechaInicial;

    private int fechaFinal;

    private String idPrestamo;

    public Prestamo(int fechaInicial, int fechaFinal, String idPrestamo) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.idPrestamo = idPrestamo;
    }

    public int getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(int fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public int getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(int fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    
    
}
