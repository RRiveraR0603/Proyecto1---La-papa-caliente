/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_papa_caliente_richard;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author RICHARD RIVERA
 */

public class Lista_Jugadores {
    Scanner modificar = new Scanner(System.in);
    Nodo primero;
    Nodo ultimo;
    
    public Lista_Jugadores(){
        primero = null;
        ultimo = null;
    }
    
    public void Insertarjugadores(String x){
        Nodo aux = new Nodo();
           aux.dato = x;
           
          
          if(primero == null){
              primero = aux;
              primero.siguiente = primero;
              aux.anterior = ultimo;
              ultimo = aux;
          }else {
              ultimo.siguiente = aux;
              aux.siguiente = primero;
              aux.anterior = ultimo;
              ultimo = aux; 
              primero.anterior = ultimo;
            }
    }
    
    public void Modificarjugadores(String x){
        Nodo NuevoJ = new Nodo();
        NuevoJ = primero;
        do{
            if(NuevoJ.dato == x){
                System.out.print("Ingrese el nuevo nombre o mote del jugador: ");
                NuevoJ.dato = modificar.nextLine();
            }  
            NuevoJ = NuevoJ.siguiente; 
        }while(NuevoJ != primero);      
    }
    
    public boolean EliminarJugadores(String x){
        
            boolean fijado = false;
            Nodo aux = ultimo;
            while(aux.siguiente != ultimo && !fijado){
                fijado = (aux.siguiente.dato == x);
                if(!fijado){
                    aux = aux.siguiente;
                }
            }
            fijado = (aux.siguiente.dato == x);
            if(fijado){
                Nodo aux2 = aux.siguiente;
                if(ultimo == ultimo.siguiente){
                    ultimo = null;
                }else {
                    if(aux2 == ultimo){
                        ultimo = aux;   
                    }
                    aux.siguiente = aux2.siguiente;
                }
                aux2 = null;
            }
            return fijado = true;
    }          
    
    
    public void MostrarJugadores(){
        Nodo aux = new Nodo();
        aux = primero;
        
        if(primero != null){
          do {
              System.out.println(aux.dato);
              aux = aux.siguiente;
          } while(aux != primero);
        }else {
            System.out.println("La lista de jugadores esta vacia");
        }
    }
    
    public void DesplegarJugaUP(){
        Nodo aux = new Nodo();
        aux = ultimo;
        
        if(ultimo != null){
            do{
             System.out.println(aux.dato);
             aux = aux.anterior;
            }while(aux != ultimo);      
        }else {
            System.out.println("La lista de jugadores esta vacia");
        }
    }
    
    Nodo recorrer (int n, String x, boolean horario){
        
        Nodo eliminado = ultimo;
        n = (int) (Math.random() *2);
        for(int i = 1; i < n; i++){
            eliminado = horario ? eliminado.siguiente: eliminado.anterior;
        
          if (primero == null){
              System.out.println("Lista Vacia");
          }else {
              Nodo aux = primero;
              while(aux.siguiente != primero && aux.dato != x){
                  eliminado = aux;
                  aux = aux.siguiente;
              }
              if(aux.dato == x){
                  if(aux.siguiente == primero && aux.anterior == primero){
                      primero = null;
                  }else{
                      eliminado.siguiente = aux.siguiente;
                  }
                  System.out.println("Elemento "+ x +" Eliminado");
              }else {
                  System.out.println("Elemento no encontado");
                }
            }
        }
        return eliminado;
    }
    
    public void Escribir(){
        
        File archivoJ;
        PrintWriter escribir;
       
            archivoJ = new File("jugadores.in");
            
            if(!archivoJ.exists()){
                System.out.println("Arichivo creado");
            try {
                archivoJ.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                System.out.println("Arichivo ya existe");
                try {
                    escribir = new PrintWriter(archivoJ,"utf-8");
                    escribir.println("Juan");
                    escribir.println("Pedro");
                    escribir.println("Simon");
                    escribir.println("Beatriz");
                    escribir.println("America");
                    escribir.println("Kevin");
                    escribir.println("Luisa");
                    escribir.println("Karla");
                    
                    escribir.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                
            }  
        }     
    }
    
    public void leer() {
        
        
            File ArchivoJ;
            FileReader leer;
            String cadena;
            ArchivoJ = new File("jugadores.in");
            try {
            leer = new FileReader(ArchivoJ);
            
            BufferedReader almacenamiento = new BufferedReader(leer);
            cadena = "";
            
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    if(cadena != null){
                        System.out.println(cadena);
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


