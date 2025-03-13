
package vista;

import java.util.Scanner;


public class Cine {
    private Scanner respuesta = new Scanner(System.in);
    
    
    //-------------------------Cliente-------------------------------
    public String interfazNombre(){
    
        System.out.println("Escriba su hombre");
        String nombre = respuesta.nextLine();
        return nombre;
    }
    public int interfazId(){      
        int id = 0;
        boolean valido = false;

        while (!valido) {
        System.out.println("Escriba su Id");
        try {
            id = respuesta.nextInt(); 
            valido = true;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: tiene que ser un número.");
            respuesta.nextLine();
        }
        }

        return id;
    }
    
    public String interfazCorreo(){
        
        System.out.println("Escriba su Correo");
        respuesta.nextLine();
        String correo = respuesta.nextLine();
        return correo;
    }
    public String interfazContraseña(){
    
        System.out.println("Escriba su Contraseña");
        String contraseña = respuesta.nextLine();
        return contraseña;
    
    }
    
    public String CambioNombre(){       
        System.out.println("Cual desea que sea su nuevo nombre: ");
        String nombre = respuesta.nextLine();
        return nombre;
    }
    
    
    
    
    //------------------------Sala------------------------
    
    
    public void peliculas(){
        System.out.println("Estas son las pelicualas que se encuentran en las:");
        System.out.println("1.Mar adentro");
        System.out.println("2.Todo sobre mi madre");
        System.out.println("3.La flor de mi secreto");
        System.out.println("4.El secreto de tus ojos");
        System.out.println("5.Hable con ella");

    
    }
    
    
    public void salasDisponibles(){
    
    
    
    }
}
