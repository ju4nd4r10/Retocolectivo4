package ProyectoRestaurante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class ElCielo {
    public static void main(String[] args) {

        Scanner Entry = new Scanner(System.in);
    Integer menuOption=0;
    String colorAzul= "\u001B[34m";
    HashMap<String,Object> employes= new HashMap<>();
    HashMap< String,Object> dishes= new HashMap<>();
    HashMap<String, Object> ingredients= new HashMap<>();

        System.out.println("\n************");
        System.out.println("** RESTAURANTE EL CIElO **");
        System.out.println("************");

        System.out.println("\n Bienvenido a gestor del restaurante...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorAzul + "1️⃣  Registrar un empleado 📝");
        System.out.println("2️⃣  Registrar un plato 🍽️");
        System.out.println("3️⃣  Ver empleados 👥");
        System.out.println("4️⃣  Ver platos 📋");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");
    menuOption = Entry.nextInt();

        while(true){
        ArrayList<Object> workes= new ArrayList<>();
        ArrayList<Object> dishesRestaurant= new ArrayList<>();

        try{

            if(menuOption==1) {
                System.out.println("Bienvenido a Restaurante Cielo. Vamos a registrar un empleado... ");

                System.out.println("Digita el id del empleado: ");
                employes.put("id", Entry.nextInt());

                System.out.println("Digita el nombre completo del empleado: ");
                Entry.nextLine();
                employes.put("Nombre", Entry.nextLine());

                System.out.println("Digita la fecha de nacimiento del empleado: ");
                employes.put("F_Nacimiento", Entry.nextLine());

                System.out.println("Digita el cargo del empleado: ");
                employes.put("Cargo", Entry.nextLine());

                System.out.println("Digita el salario del empleado: ");
                employes.put("Cargo", Entry.nextFloat());

                workes.add(employes);



            }
            else if(menuOption==2){
                System.out.println("Vamos a registrar un plato... ");

                System.out.println("Digita el id del plato: ");
                dishes.put("id", Entry.nextInt());

                System.out.println("Digita el nombre del plato: ");
                Entry.nextLine();
                dishes.put("Nombre", Entry.nextLine());

                System.out.println("Digita los ingredientes del plato: ");

                dishesRestaurant.add(dishes);


                System.out.println("Digita el Precio del plato: ");
                dishes.put("Cargo", Entry.nextFloat());

            }
            else if(menuOption==3){
                System.out.println("Ver empleados registrados");
            }
            else if(menuOption==4){
                System.out.println("Ver platos registrados");
            }
            else if(menuOption==5){
                System.out.println("Gracias por unsar nuestra  APP");
                break;
            }
            menuOption = Entry.nextInt();


        }catch (Exception error){
            System.out.println(error.getMessage());

        }

    }

}
}
