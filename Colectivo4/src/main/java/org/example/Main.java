package org.example;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entry = new Scanner(System.in);
        Integer menuOption=null;
        String colorAzul= "\u001B[34m";

        System.out.println("\n******************************");
        System.out.println("***** RESTAURANTE EL CIElO *****");
        System.out.println("********************************");

        System.out.println("\n Bienvenido a gestor del restaurante...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorAzul + "1️⃣  Registrar un empleado 📝");
        System.out.println("2️⃣  Registrar un plato 🍽️");
        System.out.println("3️⃣  Ver empleados 👥");
        System.out.println("4️⃣  Ver platos 📋");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        while(true){
            try{

                if(menuOption==1) {
                }
                else if(menuOption==2){
                    System.out.println("");
                }
                else if(menuOption==3){
                    System.out.println("");
                }
                else if(menuOption==4){
                    System.out.println("");
                }
                else if(menuOption==5){
                    System.out.println("");
                    break;
                }



            }catch (Exception error){
                System.out.println(error.getMessage());

            }

        }

    }
}