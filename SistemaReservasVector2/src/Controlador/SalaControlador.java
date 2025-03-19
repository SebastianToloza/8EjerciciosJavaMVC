package Controlador;
import Modelo.Guardado;
import vista.Cine;
import Modelo.Silla;
public class SalaControlador {
        private Guardado sillas;
        public Cine objCine;
    public SalaControlador(){
        this.sillas= new Guardado();
        this.objCine= new Cine();
        
    }
   
    
    
    public void eleccionSilla(int seleccion){
        for(int i = 0 ; i<sillas.getListaSalas().length; i++){
            if(seleccion-2==i){
                if(this.sillas.getListaSalas()[i].isDisponibilidad()){
                    this.sillas.guardarSilla(i+1);
                    System.out.println("Selecciono la silla: "+this.sillas.getListaSalas()[i].getPosicion());    
                }else{          
                    System.out.println("La silla ya esta ocupada");  
                }
            }
        }  
        for(Silla obj : this.sillas.getListaSalas()){
            System.out.println(obj.getPosicion());
        
        }
        
    }
        
    public void imprimirSillas(){
        
        
    }
    
    
}
