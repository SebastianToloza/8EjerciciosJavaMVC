/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservasvector;

import java.util.Scanner;


public class Cliente extends Persona{
        private String contraseña; 
        public Scanner respuesta = new Scanner(System.in);
        
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
            System.out.println("Escriba su contraseña");
            String contraseña2 = respuesta.nextLine();
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

