/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jairo
 */
public class GestionRegistro {
    
    public static void add(List<IMontoPago> lista, IMontoPago r){
        lista.add(r);
    }
    
    public static int eliminar(List<IMontoPago> lista, int monto){
        Iterator<IMontoPago> i = lista.iterator();
        int cont=0;
        while(i.hasNext()){
            IMontoPago registro = i.next();
            if(registro.montoPago()== monto){
                i.remove();
                cont++;
            }
        }
        return cont;
    }
    
    public static double totalPresupuesto(List<IMontoPago> lista){
        double total = 0;
        for(IMontoPago r: lista){
            total = total + r.montoPago();
        }
        return total;
    }
    
    public static List<IMontoPago> ordenar(List<IMontoPago> lista){
        List<IMontoPago> ordenada = new ArrayList(lista);
       
        for(int i=0; i< ordenada.size(); i++){
            for(int j=0; j< ordenada.size(); j++){
                if(ordenada.get(i).montoPago()>=ordenada.get(j).montoPago()){
                    
                    IMontoPago auxI = ordenada.get(i);
                    IMontoPago auxJ = ordenada.get(j);
                    ordenada.set(i, auxJ);
                    ordenada.set(j, auxI);
                }
            }
        }
        
        return ordenada;
    }
    
    public static List<IMontoPago> consulta1(List<IMontoPago> lista){
        List<IMontoPago> res = new ArrayList();
        for(IMontoPago i: lista){
            if(i instanceof Pregrado){
               Pregrado p = (Pregrado) i;
               if(p.getSemestre()>=6 && p.getSemestre()<=10){
                   if(p.getnSisben()>=1 && p.getnSisben()<=2){
                       res.add(i);
                   }
               }
            }
        }
        return res;
    }
    
    public static List<IMontoPago> consulta2(List<IMontoPago> lista, double mi, double mf){
        List<IMontoPago> res = new ArrayList();
        for(IMontoPago i: lista){
            if(i.montoPago()>=mi && i.montoPago()<=mf){
                res.add(i);
            }
        }
        return res;
    }
    
    public static void imprimir(List<IMontoPago> lista){
        for(IMontoPago i: lista){
            System.out.println(i+" -> monto pago: " + i.montoPago());
        }
    }
    
    
}
