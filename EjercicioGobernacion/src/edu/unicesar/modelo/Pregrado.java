/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.modelo;

/**
 *
 * @author jairo
 */
public class Pregrado extends Subsidio{
    private int semestre;

    public Pregrado(String nDoc, String nIES, double vMatricula, int nSisben, int semestre) {
        super(nDoc, nIES, vMatricula, nSisben);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public double montoSubsidio() {
        if(this.semestre>=1 && this.semestre<=5){
            if(this.getnSisben()>=1 && this.getnSisben()<=2){return 0.4;}
            else if(this.getnSisben()>=3 && this.getnSisben()<=4){ return 0.2;}
            else return 0;
        }
        else if(this.semestre>=6 && this.semestre<=10){
            if(this.getnSisben()>=1 && this.getnSisben()<=2){return 0.6;}
            else if(this.getnSisben()>=3 && this.getnSisben()<=4){ return 0.4;}
            else return 0;
        }
        else
            return 0;
    }

    

    @Override
    public String toString() {
        return "Pregrado{" + super.toString() + "semestre=" + semestre + '}';
    }
    
    
}
