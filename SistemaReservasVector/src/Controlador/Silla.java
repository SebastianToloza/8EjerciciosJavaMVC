
package Controlador;

public class Silla {
    boolean disponibilidad; 
    int munero;
    public Silla(){
        this.munero=0;
        this.disponibilidad=true;
        
    }
    
    public void AsignarSilla(int numero){
        for (int i = 0 ; i<20 ; i++){
        
            if(this.disponibilidad){
                System.out.println("Ese asiento ya esta ocupado");
            }else{
                this.disponibilidad=false;
                this.munero=numero;
            }
        }
    
    }
    
    public  Silla guardarSilla(){
        Silla objSilla = new Silla();
        objSilla.AsignarSilla(2);
        return objSilla;
    
    
    }
}
