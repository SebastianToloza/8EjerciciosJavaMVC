
package Modelo;

public class Silla {
    boolean disponibilidad; 
    int posicion;
    int munero;
    public Silla(){
        this.disponibilidad=true;    
        this.posicion=0;

    }
    
    public void AsignarSilla(){
        if(!this.disponibilidad){
            System.out.println("Ese asiento ya esta ocupado");
        }else{
            this.disponibilidad=false;
            
        }  
    }
    
    
    public Silla guardarSilla(int posicion, boolean disponibilidad) {
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.munero = posicion; 
        return this;
    }
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
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
