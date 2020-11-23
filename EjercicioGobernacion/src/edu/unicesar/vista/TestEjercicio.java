/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.vista;

import edu.unicesar.modelo.*;

/**
 *
 * @author jairo
 */
public class TestEjercicio {
    public static void main(String arg[]){
        
        Gobernacion g = new Gobernacion();
	
	Subsidio s1 = new Pregrado("ID123", "UPC", 1000, 1,9); // monto $600 (60%)	
	Subsidio s2 = new Pregrado("ID456", "UDES", 2000, 4,1);// monto $400 (20%)	
	Subsidio s3 = new Pregrado("ID789", "UNAD", 700, 2,7); // monto $420 (60%)	
	Subsidio s4 = new Pregrado("ID987", "ANDINA", 3000, 6,6);//0

	Subsidio s5 = new PostGrado("ID765", "NACIONAL", 3000, 1,"Publica");// monto %80 ($2400)	
        Subsidio s6 = new PostGrado("ID543", "ANDES", 8000, 6,"Privada");// monto %5	  ($400)
	Subsidio s7 = new PostGrado("ID321", "UIS", 4000, 2,"Publica");	// monto %80     ($3200)
	Subsidio s8 = new PostGrado("ID830", "MEDELLIN", 6000, 5,"Privada"); // monto %5  ($300)

	Obligacion o1 = new Obligacion("Alumbrado publico", 50000, 30); // monto $1500000
	Obligacion o2 = new Obligacion("Jornadas Deportivas", 10000, 5);// monto   $50000
	Obligacion o3 = new Obligacion("Colegios publicos", 40000, 20); // monto  $800000

        g.addRegistro(s1);	g.addRegistro(s2);
	g.addRegistro(s3);	g.addRegistro(s4);
	g.addRegistro(s5);	g.addRegistro(s6);
	g.addRegistro(s7);      g.addRegistro(s8);
	g.addRegistro(o1);      g.addRegistro(o2);
	g.addRegistro(o3);  
	
	g.calcularPresupuesto();
	g.eliminarRegistro(0);
        System.out.println("Lista Ordenada descentemente por monto pago --------");
	g.registroOrdenado();
        System.out.println("-----------------");
	g.filtrarRegistro();
	g.informeRango(500, 50000);
        
    }
}
