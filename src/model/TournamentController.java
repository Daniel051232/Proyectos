package model;

import java.util.LinkedList;
import java.util.List;

public class TournamentController {
    private List<Jugador> players;
    private List<Arbitro> referees;
    private List<equipo> equipos;

    public TournamentController() {
        players = new LinkedList<>();
        referees = new LinkedList<>();
        equipos = new LinkedList<>();
    }

    public void addPlayer(int numero, String nombre, String paisOrigen, String posicion, int goles, int asistencias) {
        Jugador player = new Jugador(numero, nombre, paisOrigen, posicion, goles, asistencias);
        players.add(player);
        System.out.println("Jugador registrado con éxito.");
    }

    public void addReferee(String id, String nombre, String paisOrigen, String tipo) {
        Arbitro referee = new Arbitro(id, nombre, paisOrigen, tipo);
        referees.add(referee);
        System.out.println("Árbitro registrado con éxito.");
    }

    public void addEquipo(String nombre, String paisOrigen) {
        equipo equipo = new equipo(nombre, paisOrigen);
        equipos.add(equipo);
        System.out.println("Equipo registrado con éxito.");
    }

    public List<Arbitro> getArbitros() {
        return referees;
    }

    public equipo consultarEquipo(String nombreEquipo) {
        for (equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }

    public void asignarArbitroAEquipo(String nombreEquipo, Arbitro referee) {
        equipo equipo = consultarEquipo(nombreEquipo);
        if (equipo != null) {
            equipo.setArbitro(referee);
            System.out.println("Árbitro asignado al equipo con éxito.");
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    public void consultarFaseGrupos() {
        System.out.println("Consulta de fase de grupos con fechas:");
        
    }
}
