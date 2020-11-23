/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jairo
 */
public class Gobernacion {
    private List<IMontoPago> listaRegistros;

    public Gobernacion() {
        this.listaRegistros = new ArrayList();
    }

    public List<IMontoPago> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(List<IMontoPago> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }
    
    
    public void addRegistro(IMontoPago r){
        GestionRegistro.add(listaRegistros, r);
    }
    public void eliminarRegistro(double monto){
        System.out.println("Eliminados : " + 
                            GestionRegistro.eliminar(listaRegistros, 0));
    }
    public void calcularPresupuesto(){
        System.out.println("Total Presupuesto: " +
                            GestionRegistro.totalPresupuesto(listaRegistros));
    };
    
    public void registroOrdenado(){
        List<IMontoPago> lista = GestionRegistro.ordenar(listaRegistros);
        GestionRegistro.imprimir(lista);
    }
    
    public void filtrarRegistro(){
        for(IMontoPago i : GestionRegistro.consulta1(listaRegistros)){
            System.out.println(i);
        }
    };
    public void informeRango(double mi, double mf){
        List<IMontoPago> lista = GestionRegistro.consulta2(listaRegistros, mi, mf);
        // pregrado
        List<IMontoPago> listaPregrado=new ArrayList();
        List<IMontoPago> listaPostgrado=new ArrayList();
        List<IMontoPago> listaObligacion=new ArrayList();
        
        for(IMontoPago i: lista){
            if(i instanceof Pregrado){
                listaPregrado.add(i);
            }
            else if( i instanceof PostGrado){
                listaPostgrado.add(i);
            } 
            else{ // obligacion
                listaObligacion.add(i);
            }
        }
        
        System.out.println("Pregrado: total " + listaPregrado.size());
        GestionRegistro.imprimir(listaPregrado);
        System.out.println("----------------------------------------");
        System.out.println("Postgrado: total " + listaPostgrado.size());
        GestionRegistro.imprimir(listaPostgrado);
        System.out.println("----------------------------------------");
        System.out.println("Obligacion: total " + listaObligacion.size());
        GestionRegistro.imprimir(listaObligacion);
        System.out.println("----------------------------------------");
        
    }
    
    
}
