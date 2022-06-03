/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.la_papa_caliente_richard;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author RICHARD RIVERA
 */

public class La_Papa_Caliente_Richard {

    public static void main(String[] args) {
        
        Lista_Jugadores l = new Lista_Jugadores();
        Ganador_perdedores t = new Ganador_perdedores();
        Scanner inicio = new Scanner (System.in);
        Scanner horario = new Scanner (System.in);
        int respuesta, horario2 = 0;
        Nodo chao;
        int Turno = 1;
        


        System.out.println("Bienvenido a la papa caliente.");
        System.out.println("");
        
        l.Escribir();
        System.out.println("Los jugadores seran: ");
        l.leer(l);
        
        
        System.out.println("");
        
        l.Insertarjugadores("Juan");
        l.Insertarjugadores("Pedro");
        l.Insertarjugadores("Simon");
        l.Insertarjugadores("Beatriz");
        l.Insertarjugadores("America");
        l.Insertarjugadores("Kevin");
        l.Insertarjugadores("Luisa");
        l.Insertarjugadores("Karla");
        
       
        System.out.println("1. Iniciar el juego.");
        System.out.println("2. Salir de juego.");
        
        respuesta = inicio.nextInt();
        
      
        switch(respuesta){
             case 1:
                  do{
                     System.out.println("Que comience el juego!");
                     System.out.println("");
                     System.out.println("1.jugar de manera horaria");
                     System.out.println("2.jugar de manera anti-horario");
                     horario2 = inicio.nextInt();
                 
                     switch(horario2){
                      case 1:
                          if(Turno == 1){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Simon");
                            l.MostrarJugadores();
                          
                            System.out.println("");
                            
                          }else if(Turno == 2){ 
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Beatriz");
                            l.MostrarJugadores();
                          
                            System.out.println("");
                            
                          }else if(Turno == 3){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("America");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 4){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Kevin");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 5){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Karla");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 6){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Luisa");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 7){
                            l.recorrer(horario2, true);
                            l.EliminarJugadores("Pedro");
                            l.MostrarJugadores();
                          }else if(Turno == 8){
                            System.out.println("NO QUEDAN JUGADORES - PRESIONE TECLA DIFERENTE DE 2");
                          }
                         break;
                      case 2:
                          if(Turno == 1){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Simon");
                            l.MostrarJugadores();
                          
                            System.out.println("");
                            
                          }else if(Turno == 2){ 
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Beatriz");
                            l.MostrarJugadores();
                          
                            System.out.println("");
                            
                          }else if(Turno == 3){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("America");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 4){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Kevin");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 5){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Karla");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 6){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Luisa");
                            l.MostrarJugadores();
                         
                            System.out.println("");
                            
                          }else if(Turno == 7){
                            l.recorrer(horario2, false);
                            l.EliminarJugadores("Pedro");
                            l.MostrarJugadores();  
                          }else if(Turno == 8){
                            System.out.println("NO QUEDAN JUGADORES - PRESIONE TECLA DIFERENTE DE 2");
                          }
                          break;       
                        }Turno++;
                    }while(horario2 != 3);
             case 2:
                 System.out.println("Fin del juego");
                 break;
             default:
                 System.out.println("Se ha producido un error. Esa eleccion no se encuentra disponible.");
                 break;
               
       }
       System.out.println("");
       t.EscribirPerdedores();
       t.leerPerdedores(l);
       System.out.println("");
       t.Escribirganador();
       t.leerganador(l);
       System.out.println("");
       System.out.println("Juego finalizado.");
       System.out.println("Gracias por jugar, hasta la proxima.");     
    }         
}
       