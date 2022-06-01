/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.la_papa_caliente_richard;
import java.util.Scanner;
/**
 *
 * @author RICHARD RIVERA
 */

public class La_Papa_Caliente_Richard {

    public static void main(String[] args) {


        Lista_Jugadores l = new Lista_Jugadores();
        Scanner in =new Scanner(System.in);
        String Nombre, Nombre2 = null;
        int op = 0, op2 = 0, jugar = 0;
        boolean horario = false;
        
       System.out.println("LA PAPA CALIENTE");
       
       System.out.println("Los Jugadores seran: ");
       l.Insertarjugadores(1);
       l.Insertarjugadores(2);
       l.Insertarjugadores(3);
       l.Insertarjugadores(4);
       l.Insertarjugadores(5);
       l.Insertarjugadores(7);
       
       l.MostrarJugadores();
       System.out.println("");
       l.DesplegarJugaUP();
       
       l.EliminarJugadores(7);
       
       l.MostrarJugadores();
       System.out.println("");
       l.DesplegarJugaUP();
       
       System.out.println("Quiere jugar en zona horaria: ");
       horario = in.nextBoolean();
       l.recorrer(10, true);
       
       if(horario == false){
           l.DesplegarJugaUP();
       }else{
           l.MostrarJugadores();
       }
       
    }    
}
       