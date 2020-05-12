/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guion0iajaviergutierrez;

import java.util.Scanner;

/**
 *
 * @author jgr97
 */
public class Alumno_IA extends Alumno{
    
    public final int gPracticas;
    public double nPracticas;

    public Alumno_IA() {
        super();
        this.gPracticas = 0;
        this.nPracticas = 0;
    }

    public Alumno_IA(int gPracticas, int nPracticas) {
        super();
        this.gPracticas = gPracticas;
        this.nPracticas = nPracticas;
    }

    public Alumno_IA(int gPracticas, int nPracticas, String nombre, String dni, String email) {
        super(nombre, dni, email);
        this.gPracticas = gPracticas;
        this.nPracticas = nPracticas;
    }
    
    public void calculoNotas(){
        double total=0;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce las cuatro notas: ");
        for(int i=0; i<4; i++){
            double nota=teclado.nextDouble();
            
            total=total+nota;
            
        }
        
        nPracticas=total/4;
        
        System.out.println("Nota de practicas: "+ nPracticas);
    }
    
}
