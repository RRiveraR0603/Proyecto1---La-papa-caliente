/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_papa_caliente_richard;
import java.util.Scanner;
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
    
    public void Insertarjugadores(int x){
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
    
    public void Modificarjugadores(int x){
        Nodo NuevoJ = new Nodo();
        NuevoJ = primero;
        do{
            if(NuevoJ.dato == x){
                System.out.print("Ingrese el nuevo nombre o mote del jugador: ");
                NuevoJ.dato = modificar.nextInt();
            }  
            NuevoJ = NuevoJ.siguiente; 
        }while(NuevoJ != primero);      
    }
    
    public void EliminarJugadores(int x){
        if (primero == null){
            System.out.println("Lista Vacia");
        }else {
            Nodo aux = primero;
            Nodo aux2 = ultimo;
            while(aux.siguiente != primero && aux.dato != x){
                aux2 = aux;
                aux = aux.siguiente;
            }
            if(aux.dato == x){
                if(aux.siguiente == primero && aux.anterior == primero){
                    primero = null;
                }else{
                    aux2.siguiente = aux.siguiente;
                }
                System.out.println("Elemento "+ x +" Eliminado");
            }else {
                System.out.println("Elemento no encontado");
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
    
    Nodo recorrer (int n, boolean horario){
        
        Nodo aux = ultimo;
        for(int i = 1; i < n; i++){
            aux = horario ? aux.siguiente: aux.anterior;
        } 
        return aux;
    }
}


