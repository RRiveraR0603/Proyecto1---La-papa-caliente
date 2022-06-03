/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_papa_caliente_richard;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.StringTokenizer;
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
    
    void Modificarjugadores(String x){
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
    
    Nodo recorrer (int n, boolean horario){
        
        Nodo aux = ultimo;
        n = (int) (Math.random() *2);
        for(int i = 1; i < n; i++){
            aux = horario ? aux.siguiente: aux.anterior;  
            
        } return aux;  
    }
    
    @SuppressWarnings("empty-statement")
    public void EliminarJugadores(String n){
        
        if (primero == null){
            System.out.println("Lista vacia");
        }else{
            Nodo aux = primero;
            Nodo aux2 = ultimo; 
            
            while(aux.siguiente != ultimo && aux.dato != n){
                aux2 = aux;
                aux = aux.siguiente;
            }
            if (aux.dato == n){
                if (aux.siguiente == primero && aux == ultimo){
                    primero = null;   
                }else if(aux == primero){
                       primero = primero.siguiente;
                       ultimo.siguiente = ultimo;
                       primero.anterior = ultimo;        
                } else {
                       aux2.siguiente = aux.siguiente;
                }
                System.out.println("El jugador " + n + " Ha sido eliminado");
            }else{
                System.out.println("El jugador " + n + " Ha sido eliminado");    
            }            
        }
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
    
    
    public void Escribir(){
        
        File archivoJ;
        PrintWriter escribir;
       
            archivoJ = new File("jugadores.in");
            
            if(!archivoJ.exists()){
            try {
                archivoJ.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Lista_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
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
    
    public void leer(Lista_Jugadores lis) {
        
        
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


