/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_papa_caliente_richard;
import java.util.Scanner;
import static javax.security.auth.callback.ConfirmationCallback.NO;
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
    
    public void Insertajugadores(String x){
        Nodo NJugar = new Nodo();
           NJugar.NombreJ = x;
           
          if(primero == null){
              primero = NJugar;
              ultimo = NJugar;
              primero.sgte = primero;
              ultimo.ant = ultimo;
          }else {
              ultimo.sgte = NJugar;
              NJugar.sgte = primero;
              NJugar.ant = ultimo;
              ultimo = NJugar; 
              primero.ant = ultimo;
            }
    }
    
    public void Modificarjugadores(String x){
        Nodo NuevoJ = new Nodo();
        NuevoJ = primero;
        do{
            if(NuevoJ.NombreJ == x){
                System.out.print("Ingrese el nuevo nombre o mote del jugador: ");
                NuevoJ.NombreJ = modificar.nextLine();
            }  
            NuevoJ = NuevoJ.sgte; 
        }while(NuevoJ != primero);      
    }
    
    public void EliminarJugadores(String x){
        Nodo Jugador = new Nodo();
        Nodo atras = new Nodo();
        Jugador = primero;
        atras = ultimo;
        
        do{
            if(Jugador.NombreJ == x){
                primero = primero.sgte;
                ultimo.sgte = primero;
            }else if(Jugador == ultimo){
                atras.sgte = ultimo.sgte;
                ultimo = atras;
            }else {
                atras.sgte = Jugador.sgte;
            }
            atras.sgte = Jugador.sgte;   
        }while(Jugador != primero);   
    }
    
    
    public void MostrarJugadores(){
        Nodo aux = new Nodo();
        aux = primero;
        
        if(primero != null){
          do {
              System.out.println(aux.NombreJ);
              aux = aux.sgte;
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
             System.out.println(aux.NombreJ);
             aux = aux.ant;
            }while(aux != ultimo);      
        }else {
            System.out.println("La lista de jugadores esta vacia");
        }
    }
}


