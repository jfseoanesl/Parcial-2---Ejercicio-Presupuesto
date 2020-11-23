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
public abstract class Subsidio implements IMontoPago {
    private String nDoc;
    private String nIES;
    private double vMatricula;
    private int nSisben;

    public Subsidio(String nDoc, String nIES, double vMatricula, int nSisben) {
        this.nDoc = nDoc;
        this.nIES = nIES;
        this.vMatricula = vMatricula;
        this.nSisben = nSisben;
    }

    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    public String getnIES() {
        return nIES;
    }

    public void setnIES(String nIES) {
        this.nIES = nIES;
    }

    public double getvMatricula() {
        return vMatricula;
    }

    public void setvMatricula(double vMatricula) {
        this.vMatricula = vMatricula;
    }

    public int getnSisben() {
        return nSisben;
    }

    public void setnSisben(int nSisben) {
        this.nSisben = nSisben;
    }
    
    public abstract double montoSubsidio();

    @Override
    public String toString() {
        return  "nDoc=" + nDoc + ", nIES=" + nIES + ", vMatricula=" + vMatricula + ", nSisben=" + nSisben ;
    }
    
    @Override
    public double montoPago() {
        return this.montoSubsidio() * this.getvMatricula();
    }
    
    
}
