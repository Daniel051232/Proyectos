package model;

public class Arbitro {
    private String id;
    private String nombre;
    private String paisOrigen;
    private String tipo;  // Central, Asistente
    private int tarjetasColocadas;

    public Arbitro(String id, String nombre, String paisOrigen, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.tipo = tipo;
        this.tarjetasColocadas = 0;
    }

    public Arbitro(String id2, String name, String country, int matchesFind, int tipoDeArbitro) {
        //TODO Auto-generated constructor stub
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTarjetasColocadas() {
        return tarjetasColocadas;
    }

    public void setTarjetasColocadas(int tarjetasColocadas) {
        this.tarjetasColocadas = tarjetasColocadas;
    }

    @Override
    public String toString() {
        return "Árbitro [ID=" + id + ", Nombre=" + nombre + ", País de Origen=" + paisOrigen + ", Tipo=" + tipo + ", Tarjetas Colocadas=" + tarjetasColocadas + "]";
    }
}
