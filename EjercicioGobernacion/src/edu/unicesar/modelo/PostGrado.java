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
public class PostGrado extends Subsidio {
     private String categoriaIES;

    public PostGrado( String nDoc, String nIES, double vMatricula, int nSisben, String categoriaIES) {
        super(nDoc, nIES, vMatricula, nSisben);
        this.categoriaIES = categoriaIES;
    }

    public String getCategoriaIES() {
        return categoriaIES;
    }

    public void setCategoriaIES(String categoriaIES) {
        this.categoriaIES = categoriaIES;
    }

    @Override
    public double montoSubsidio() {
        if(this.categoriaIES.equalsIgnoreCase("Publica")){
            if(this.getnSisben()>=1 && this.getnSisben()<=2){return 0.8;}
            else if(this.getnSisben()>=3 && this.getnSisben()<=4){ return 0.5;}
            else if(this.getnSisben()>=5 && this.getnSisben()<=6){ return 0.1;}
            else return 0;
        }
        else if(this.categoriaIES.equalsIgnoreCase("Privada")){
            if(this.getnSisben()>=1 && this.getnSisben()<=2){return 0.5;}
            else if(this.getnSisben()>=3 && this.getnSisben()<=4){ return 0.3;}
            else if(this.getnSisben()>=5 && this.getnSisben()<=6){ return 0.05;}
            else return 0;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return "PostGrado{" +super.toString()+ " categoriaIES=" + categoriaIES + '}';
    }

    
     
    
     
}
