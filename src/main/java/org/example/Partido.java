package org.example;

import lombok.Getter;
import lombok.Setter;

public class Partido {
    @Getter
    private Equipo equipo1;
    @Getter
    private Equipo equipo2;
    @Getter
    private int golesEquipo1;
    @Getter
    private int golesEquipo2;
    @Getter
    private int id;
    @Getter
    private int ronda;
    public Partido(int id, Equipo eq1, Equipo eq2, int golesEq1, int golesEq2, int ronda){
        this.id = id;
        this.equipo1 = eq1;
        this.equipo2 = eq2;
        this.golesEquipo1 = golesEq1;
        this.golesEquipo2 = golesEq2;
        this.ronda = ronda;
    }
    public ResultadoEnum resultado(Equipo equipo){
        if (this.golesEquipo1==this.getGolesEquipo2()) {
            return  ResultadoEnum.empate;
        }
        if(equipo.equals(equipo1)){
            if(golesEquipo1>golesEquipo2){
                return ResultadoEnum.ganador;
            } else if (golesEquipo1<golesEquipo2) {
                return ResultadoEnum.perdedor;
            }
        }
        if (equipo.equals(equipo2)) {
            if(golesEquipo1>golesEquipo2){
                return ResultadoEnum.perdedor;
            } else if (golesEquipo1<golesEquipo2) {
                return ResultadoEnum.ganador;
            }
        }
        return ResultadoEnum.desconocido;
    }
}
