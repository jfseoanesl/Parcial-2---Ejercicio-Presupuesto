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
public class Obligacion implements IMontoPago {
    private String descripcion;
    private double vCuota;
    private int pPendiente;

    public Obligacion(String descripcion, double vCuota, int pPendiente) {
        this.descripcion = descripcion;
        this.vCuota = vCuota;
        this.pPendiente = pPendiente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getvCuota() {
        return vCuota;
    }

    public void setvCuota(double vCuota) {
        this.vCuota = vCuota;
    }

    public int getpPendiente() {
        return pPendiente;
    }

    public void setpPendiente(int pPendiente) {
        this.pPendiente = pPendiente;
    }

    @Override
    public String toString() {
        return "Obligacion{" + "descripcion=" + descripcion + ", vCuota=" + vCuota + ", pPendiente=" + pPendiente + '}';
    }
    
    public double saldoPendiente(){
        return this.pPendiente * this.vCuota;
    }

    @Override
    public double montoPago() {
        return this.saldoPendiente();
    }

   
}
