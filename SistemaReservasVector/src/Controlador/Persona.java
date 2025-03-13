
package Controlador;

import java.util.Scanner;

import vista.Cine;
public class Persona {
    private String nombre;
    private int id;
    private String correo;
    public Scanner respuesta = new Scanner(System.in);
    public Cine objCine = new Cine();
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
        
            String nombre2=objCine.interfazNombre();
            this.nombre=nombre2;
    }
    
    
    
    
    //-------------Id--------------
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }
    
    public void pedirId(){
       
            
            int id2=objCine.interfazId();
            this.id=id2;


        
    }
    
    
    
    
    
    
    //----------Correo-----------
    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void pedirCorreo(){
       
            String correo2 = objCine.interfazCorreo();
            this.correo=correo2;
    }
       
}
