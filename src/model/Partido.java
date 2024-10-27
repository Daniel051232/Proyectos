package model;

import java.util.Date;

public class Partido<Equipo> {
    
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitroCentral;
    private Arbitro asistentes;
    private int golesLocal;
    private int golesVisitante;
    private Jugador goleadores;
    private Jugador asistidores;

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Arbitro getArbitroCentral() {
        return arbitroCentral;
    }

    public void setArbitroCentral(Arbitro arbitroCentral) {
        this.arbitroCentral = arbitroCentral;
    }

    public Arbitro getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Arbitro asistentes) {
        this.asistentes = asistentes;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Jugador getGoleadores() {
        return goleadores;
    }

    public void setGoleadores(Jugador goleadores) {
        this.goleadores = goleadores;
    }

    public Jugador getAsistidores() {
        return asistidores;
    }

    public void setAsistidores(Jugador asistidores) {
        this.asistidores = asistidores;
    }

    @SuppressWarnings("unchecked")
    public Partido(Equipo equipoLocal, Arbitro arbitros, Arbitro arbitroCentral, Arbitro asistentes) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = (Equipo) arbitros;
        this.arbitroCentral = arbitroCentral;
        this.asistentes = asistentes;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.goleadores = new Jugador(golesLocal, null, null, null, golesLocal, golesLocal);
        this.asistidores = (Jugador) Asistents();
    }

    private Jugador Asistents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Asistents'");
    }

    public Partido(Equipo equipos, Arbitro arbitros, Date fechaInicio, Date fechaFin) {
        //TODO Auto-generated constructor stub
    }

    // Métodos para registrar goles, asistencias y tarjetas
}

