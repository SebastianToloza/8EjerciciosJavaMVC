
package sistemareservasvector;

import java.util.Scanner;


public class Persona {
    private String nombre;
    private int id;
    private String correo;
    public Scanner respuesta = new Scanner(System.in);

    public Persona(){
        this.nombre="";
        this.id=0;
        this.correo="";
    }
    
    
   
    
    //------------Nombre-----------

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void pedirNombre(){
        
        
        int control ;
        do{
            
        try {
            
            System.out.println("Escriba su hombre");
            String nombre2 = respuesta.nextLine();
            this.nombre=nombre2;
            control=1;
            
        } catch (java.util.InputMismatchException e) {
            
            System.out.println("Error: tiene que se numeros");
            respuesta.nextLine();  
            control=0;
        } 
        
        }while(control==0);
    }
    
    
    
    
    //-------------Id--------------
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }
    
    public void pedirId(){
        
        int control ;
        do{
            
        try {
            
            System.out.println("Escriba su Id");
            int id2 = respuesta.nextInt();
            respuesta.nextLine();
            this.id=id2;
            control=1;
            
        } catch (java.util.InputMismatchException e) {
            
            System.out.println("Error: tiene que se numeros");
            respuesta.nextLine();  
            control=0;
        } 
        
        }while(control==0);

        
    }
    
    
    
    
    
    
    //----------Correo-----------
    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void pedirCorreo(){
        
        int control ;
        do{
            
        try {
            
            System.out.println("Escriba su correo");
            String correo2 = respuesta.nextLine();
            this.correo=correo2;
            control=1;
            
        } catch (java.util.InputMismatchException e) {
            
            System.out.println("Error: tiene que se numeros");
            respuesta.nextLine();  
            control=0;
        } 
        
        }while(control==0);
    }
       
}
