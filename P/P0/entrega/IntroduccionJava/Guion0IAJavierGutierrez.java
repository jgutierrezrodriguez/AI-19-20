/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guion0iajaviergutierrez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jgr97
 */
public class Guion0IAJavierGutierrez {

    private static ArrayList<Alumno> leerDatos(String nFichero) throws FileNotFoundException, IOException{
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
        File fichero = new File(nFichero);
        BufferedReader lector = new BufferedReader(new FileReader(fichero));
        
        String linea;
        while((linea=lector.readLine())!=null){
            String [] str= linea.split(", ");
            
            Alumno al = new Alumno(str[0],str[1],str[2]);
            listaAlumnos.add(al);
        }
        return listaAlumnos;
    }
    
    private static void volcarAlumnosPares(ArrayList<Alumno> listaAlumnos, String nFichero) throws IOException{
        ArrayList<Alumno> alumnos_pares=new ArrayList<>();
        
        for(int i =0; i<listaAlumnos.size();i++){
            int dni = Integer.valueOf(listaAlumnos.get(i).getDni());
            
            if(dni%2==0)
                alumnos_pares.add(listaAlumnos.get(i));
            
        }
        
        File fichero = new File(nFichero);
        BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));
        
        for(int i=0; i<alumnos_pares.size(); i++){
            escritor.write(alumnos_pares.get(i).toString());
            escritor.newLine();
        }
        
        escritor.close();
    }
        
    public static void main(String[] args) {
        
        ArrayList<Alumno>lista_alumnos;
        
        try {
            lista_alumnos=leerDatos("datos.txt");
            
            for(int i =0; i<lista_alumnos.size(); i++){
                lista_alumnos.get(i).muestraDatos();
            }
            
            
            volcarAlumnosPares(lista_alumnos, "pares.txt");
            
            Alumno_IA al = new Alumno_IA(1,0,"Javier Gutierrez","53597992", "jgr00053");
            
            al.calculoNotas();
            
            System.out.println("Vamos a crear un nuevo alumno: ");
            Alumno nuevo_al=al.nuevoAlumno();
            nuevo_al.muestraDatos();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }
    
}
