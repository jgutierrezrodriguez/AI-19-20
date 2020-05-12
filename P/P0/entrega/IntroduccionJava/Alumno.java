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
public class Alumno {
    public final String nombre,dni,email;

    public Alumno() {
        this.nombre = null;
        this.dni = null;
        this.email = null;
    }

    public Alumno(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }
    
    public Alumno nuevoAlumno (){
        
        Scanner teclado = new Scanner (System.in);
        
        String nombre,dni,email;
        
        System.out.println("Introduce un nombre: ");
        nombre=teclado.next();
        
        System.out.println("Introduce un dni: ");
        dni=teclado.next();
        
        System.out.println("Introduce un email: ");
        email=teclado.next();
        
        Alumno ret = new Alumno(nombre, dni, email);
        
        return ret;
    }
    
    public void muestraDatos(){
        System.out.println("Alumno: { Nombre: "+ nombre + ", DNI: "+dni+", E-Mail: "+email+" }");
    }

    @Override
    public String toString() {
        String a_devolver="Alumno: { Nombre: "+ nombre + ", DNI: "+dni+", E-Mail: "+email+" }";
        return a_devolver;
    }
    

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
