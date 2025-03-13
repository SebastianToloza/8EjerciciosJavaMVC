
package sistemareservasvector;

import Controlador.Cliente;
import java.util.Scanner;

public class SistemaReservasVector {
    public static void main(String[] args) {
        Cliente cliente2 = new Cliente();
        Cliente usuario=cliente2.guardarCliente();
        usuario.imprimirInformacion();
        System.out.println("Escriba su nueva contraseña");
        Scanner Respuesta = new Scanner(System.in);
        String contraseña = Respuesta.nextLine();
        usuario.setContraseña(contraseña);
        usuario.imprimirInformacion();
        
    }
    
}
