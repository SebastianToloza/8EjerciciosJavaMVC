
package Modelo;
import Controlador.Cliente;
import Controlador.Silla;
import Controlador.Sala;
import java.util.ArrayList;
public class Guardado {
    private ArrayList<Cliente> listaCliente;
    private Sala[] listaSalas;
    private Silla[] liSillas;
    public Guardado(){
        this.liSillas = new Silla[20];
        this.listaSalas = new Sala[5];
        this.listaCliente= new ArrayList<Cliente>();
    }
    
}
