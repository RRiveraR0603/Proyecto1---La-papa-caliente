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
        Scanner inicio = new Scanner (System.in);
        Scanner horario = new Scanner (System.in);
        int respuesta, horario2 = 0;
        String jugador = null;


        System.out.println("Bienvenido a la papa caliente.");
        System.out.println("");
        
        l.Escribir();
        System.out.println("Los jugadores seran:");
        l.leer();
       
         
        l.Insertarjugadores("Juan");
        l.Insertarjugadores("Pedro");
        l.Insertarjugadores("Mauricio");
        l.Insertarjugadores("Maria");
        l.Insertarjugadores("Jose");
        
        System.out.println("");
        
        l.EliminarJugadores("Juan");
        
       
        l.MostrarJugadores();
         
        System.out.println("1. Iniciar el juego.");
        System.out.println("2. Salir de juego.");
        
        respuesta = inicio.nextInt();
       
        switch(respuesta){
             case 1:
                 System.out.println("Que comience el juego!");
                 System.out.println("");
                 System.out.println("1.jugar de manera horaria");
                 System.out.println("2.jugar de manera anti-horario");
                 horario2 = inicio.nextInt();
                 switch(horario2){
                   case 1:
                       l.recorrer(horario2, "Juan", true);
                       l.MostrarJugadores();
                       break;
                   case 2:
                       System.out.println("el recorrer sera false antihorario");
                       
                       break;       
                    } 
                 break;
             case 2:
                 System.out.println("Fin del juego");
                 break;
             default:
                 System.out.println("Se ha producido un error. Esa eleccion no se encuentra disponible.");
                 break;
               
       }
       System.out.println("");
       System.out.println("Juego finalizado.");
       System.out.println("Gracias por jugar, hasta la proxima.");
              
        
       
    }         
}
       