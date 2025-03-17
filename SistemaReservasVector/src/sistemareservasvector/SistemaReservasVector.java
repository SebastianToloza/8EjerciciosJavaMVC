
package sistemareservasvector;

import Controlador.Cliente;
import Controlador.Sala;
import java.util.Scanner;


public class SistemaReservasVector {
    public static void main(String[] args) {
        Cliente cliente2 = new Cliente();
        Cliente usuario=cliente2.guardarCliente();
        usuario.imprimirInformacion();
        
        
        
        Scanner respuesta = new Scanner(System.in);
        
        Sala salas = new Sala();
        for(int i=0 ; i<5 ; i++){
            System.out.println("hoal");
            int eleccion = respuesta.nextInt();
            salas.eleccionSilla(eleccion);

        }
        
        
    }
    
}
