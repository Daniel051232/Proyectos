package model;

public class Jugador {
    private int numero;
    private String nombre;
    private String paisOrigen;
    private String posicion;
    private int goles;
    private int asistencias;

    public Jugador(int numero, String nombre, String paisOrigen, String posicion, int goles, int asistencias) {
        this.numero = numero;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.posicion = posicion;
        this.goles = goles;
        this.asistencias = asistencias;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public int getGoles() { return goles; }
    public void setGoles(int goles) { this.goles = goles; }

    public int getAsistencias() { return asistencias; }
    public void setAsistencias(int asistencias) { this.asistencias = asistencias; }

    @Override
    public String toString() {
        return "Jugador{" +
               "Número=" + numero +
               ", Nombre='" + nombre + '\'' +
               ", País de Origen='" + paisOrigen + '\'' +
               ", Posición='" + posicion + '\'' +
               ", Goles=" + goles +
               ", Asistencias=" + asistencias +
               '}';
    }
}
