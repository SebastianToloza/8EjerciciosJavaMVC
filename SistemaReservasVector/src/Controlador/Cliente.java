
package Controlador;

import java.util.Scanner;

import vista.Cine;
public class Cliente extends Persona{
        private String contraseña; 
        public Scanner respuesta = new Scanner(System.in);
        public Cine objCine =  new Cine();

        public Cliente(){
            super();
        }
        
        public void pedirDatos(){
            super.pedirNombre();
            super.pedirId();
            super.pedirCorreo();
        }
        
       
        
        //----------Contraseña---------
        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }
        
        public void pedirContraseña(){
            String contraseña2=objCine.interfazContraseña();
            
            this.contraseña=contraseña2;
        }
        
        //----------------Ver------------------
        
        
        public void imprimirInformacion(){
            System.out.println("Nombre:"+super.getNombre());
            System.out.println("Id:"+super.getId());
            System.out.println("Correo:"+super.getCorreo());
            System.out.println("Contraseña:"+this.contraseña);
        }
        //-----------Guardar Informacion--------------
        public Cliente guardarCliente(){
            Cliente objCliente = new Cliente();
            objCliente.pedirDatos();
            objCliente.pedirContraseña();
            return objCliente;
        }
    }

