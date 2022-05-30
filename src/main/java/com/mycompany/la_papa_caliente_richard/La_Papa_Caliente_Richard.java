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
        
        Scanner Ingresar = new Scanner(System.in);
        Lista_Jugadores l = new Lista_Jugadores();
        int opcion = 0, opcion2 = 0, opcion3 = 0;        
        
        do{
            System.out.println("LA PAPA CALIENTE");
            System.out.println("");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir del Juego");
            opcion = Ingresar.nextInt();
            switch(opcion){
                case 1:
                    do{
                       System.out.println("BIENVENIDO AL JUEGO");
                       System.out.println("1. Ingresar su nombre o un mote al jugador");
                       System.out.println("2. Empezar el juego/Primero ingresar los jugadores");
                       opcion2 = Ingresar.nextInt();
                       switch(opcion2){
                           case 1:    
                               System.out.print("Ingresa el nombre o mote: ");
                               String NombreJ = Ingresar.nextLine();
                               l.Insertajugadores(NombreJ);
                               break;
                           case 2:
                               do{    
                                 System.out.println("1. A JUGAAAAR");
                                 System.out.println("2. Modifica el nombre o mote de algun jugador");
                                 System.out.println("3. Elimina algun jugador");
                                 System.out.println("4. Mostar lista de Jugadores");
                                 System.out.println("5. Salir del juego");
                                 opcion3 = Ingresar.nextInt();
                                 switch(opcion3){
                                     case 1:
                                         break;
                                     case 2:
                                         break;
                                     case 3:
                                         System.out.print("Ingrese el nombre del jugador que se va a eliminar: ");
                                         NombreJ = Ingresar.nextLine();
                                         l.EliminarJugadores(NombreJ);
                                         break;
                                     case 4:
                                         break;
                                     case 5:
                                         break;
                                     default:
                                    }
                                }while(opcion3 != 5);
                               break;
                            default:
                        }
                    }while(opcion2 != 2); 
                    break;    
                case 2:
                    break; 
                default:
            }     
        }while(opcion != 2);
        
        System.out.println("Ultimo al primero");
        l.DesplegarJugaUP();
        
    }
}
