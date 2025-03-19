
package Modelo;
import java.util.ArrayList;
public class Guardado {
    private ArrayList<Cliente> listaCliente;
    private Silla[] listaSalas;
    public Guardado(){
        this.listaSalas = new Silla[20];
        this.listaCliente= new ArrayList<Cliente>();
        
        for (int i = 0; i < listaSalas.length; i++) {
            listaSalas[i] = new Silla();
        }
        listaCliente.add(new Cliente());
                
    }
    public void guardarSilla(int numero){
        
        for(int i = 0 ;  i < listaSalas.length; i++){
            if(numero==i){
                
                Silla objSilla = new Silla();
                listaSalas[i]=objSilla.guardarSilla(numero, false);
            }
        } 
    }
    
    public void imprimirInformacion(){
    
        for (Silla objSilla : listaSalas) {
            if(objSilla.isDisponibilidad()){
                System.out.println("Los asientos reservados son"+objSilla.getMunero());
                
            }
        }
    
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Silla[] getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(Silla[] listaSalas) {
        this.listaSalas = listaSalas;
    }
    
    
    
}
 