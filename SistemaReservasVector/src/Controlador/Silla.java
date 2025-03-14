
package Controlador;

public class Silla {
    boolean disponibilidad; 
    int munero;
    public Silla(){
        this.disponibilidad=true;       
    }
    
    public void AsignarSilla(){
        if(!this.disponibilidad){
            System.out.println("Ese asiento ya esta ocupado");
        }else{
            this.disponibilidad=false;
            
        }
        
    
    }
    
    
    public  Silla guardarSilla(){
        Silla objSilla = new Silla();
        objSilla.AsignarSilla();
        return objSilla;
    
    
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getMunero() {
        return munero;
    }

    public void setMunero(int munero) {
        this.munero = munero;
    }
    
    
}
