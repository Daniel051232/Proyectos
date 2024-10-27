package model;

import java.util.Date;

import org.w3c.dom.Text;

public class Torneo<team> {
    
    private team equipos;
   
    private Partido partidos[];
    
    public void setEquipos(Text equipos) {
        this.equipos = (team) equipos;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }

    private Arbitro arbitros;
    
    private Date fechaInicio;

    public Torneo(team equipos, Arbitro arbitros, Date fechaInicio, Date fechaFin) {
        this.equipos = equipos;
        this.arbitros = arbitros;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.partidos = new Partido[100];
    }
    
    public Arbitro getArbitros() {
        return arbitros;
    }

    public void setArbitros(Arbitro arbitros) {
        this.arbitros = arbitros;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    private Date fechaFin;

    


}
