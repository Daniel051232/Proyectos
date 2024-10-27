package model;

import java.util.ArrayList;
import java.util.List;

public class equipo {
    private String nombre;
    private String pais;
    private String directorTecnico;
    private String asistenteTecnico;
    private List<Jugador> jugadores;
    private List<Arbitro> arbitrosAsignados;

    public equipo(String nombre2, String pais2) {
        //TODO Auto-generated constructor stub
    }

    public void equipo(String nombre, String pais, String directorTecnico, String asistenteTecnico) {
        this.nombre = nombre;
        this.pais = pais;
        this.directorTecnico = directorTecnico;
        this.asistenteTecnico = asistenteTecnico;
        this.jugadores = new ArrayList<>();
        this.arbitrosAsignados = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getDirectorTecnico() { return directorTecnico; }
    public void setDirectorTecnico(String directorTecnico) { this.directorTecnico = directorTecnico; }

    public String getAsistenteTecnico() { return asistenteTecnico; }
    public void setAsistenteTecnico(String asistenteTecnico) { this.asistenteTecnico = asistenteTecnico; }

    public List<Jugador> getJugadores() { return jugadores; }
    public void addJugador(Jugador jugador) { this.jugadores.add(jugador); }

    public List<Arbitro> getArbitrosAsignados() { return arbitrosAsignados; }
    public void asignarArbitro(Arbitro arbitro) { this.arbitrosAsignados.add(arbitro); }

    @Override
    public String toString() {
        return "Equipo{" +
               "Nombre='" + nombre + '\'' +
               ", País='" + pais + '\'' +
               ", Director Técnico='" + directorTecnico + '\'' +
               ", Asistente Técnico='" + asistenteTecnico + '\'' +
               ", Jugadores=" + jugadores.size() +
               ", Árbitros Asignados=" + arbitrosAsignados.size() +
               '}';
    }

    public void setArbitro(Arbitro referee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setArbitro'");
    }
}
