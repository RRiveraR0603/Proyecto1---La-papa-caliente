/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_papa_caliente_richard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RICHARD RIVERA
 */
public class Ganador_perdedores {
    
    public void EscribirPerdedores(){
        
        File archivoJ;
        PrintWriter escribir;
       
            archivoJ = new File("perdedores.out");
            
            if(!archivoJ.exists()){
            try {
                archivoJ.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                try {
                    escribir = new PrintWriter(archivoJ,"utf-8");
                    escribir.println("El Jugador Simon perdio en el turno #1");
                    escribir.println("El Jugador@ Beatriz perdio en el turno #2");
                    escribir.println("El jugador@ America perdio en el turno #3");
                    escribir.println("El jugador Kevin perdio en el turno #4");
                    escribir.println("El jugador@ Karla perdio en el turno #5");
                    escribir.println("El jugador@ Luisa perdio en el turno #6");
                    escribir.println("El jugador Pedro perdio en el turno #7");
                    
                    
                    escribir.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                
            }  
        }     
    }
    
    public void leerPerdedores(Lista_Jugadores lis) {
        
            File ArchivoJ;
            FileReader leer;
            String cadena;
            ArchivoJ = new File("perdedores.out");
            try {
            leer = new FileReader(ArchivoJ);
            
            BufferedReader almacenamiento = new BufferedReader(leer);
            cadena = "";
            
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    if(cadena != null){
                        String[] datos = cadena.split("--");
                        String nombre = datos[0];
                        System.out.println(nombre);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }
            try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void Escribirganador(){
        
        File archivoJ;
        PrintWriter escribir;
       
            archivoJ = new File("ganador.out");
            
            if(!archivoJ.exists()){
            try {
                archivoJ.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                try {
                    escribir = new PrintWriter(archivoJ,"utf-8");
                    escribir.println("El Jugador Juan ha ganado el juego, FELICIDADES");
                    
                    escribir.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                
            }  
        }     
    }
     
     public void leerganador(Lista_Jugadores lis) {
        
            File ArchivoJ;
            FileReader leer;
            String cadena;
            ArchivoJ = new File("ganador.out");
            try {
            leer = new FileReader(ArchivoJ);
            
            BufferedReader almacenamiento = new BufferedReader(leer);
            cadena = "";
            
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    if(cadena != null){
                        String[] datos = cadena.split("--");
                        String nombre = datos[0];
                        System.out.println(nombre);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }
            try {
                    almacenamiento.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
