
package Controlador;
    
import vista.Cine;

public class Sala {
        private Silla[] liSillas;
        private Silla sillas;
        public Cine objCine;
    public Sala(){
        this.liSillas = new Silla[20];
        this.sillas= new Silla();
        this.objCine= new Cine();
        
    }
    
    public Silla[] getLiSillas() {
        return liSillas;
    }

    public void setLiSillas(Silla[] liSillas) {
        this.liSillas = liSillas;
    }
    
    
    public void eleccionSilla(int seleccion){
        for(int i = 0 ; i<this.liSillas.length; i++){
            if(seleccion-1==i){
                if(this.liSillas[i]==null){
                    Silla nuevo = this.sillas.guardarSilla();
                    this.liSillas[i]=nuevo;
                    System.out.println(this.liSillas[i].disponibilidad);
                }else{
                    if(!this.liSillas[i].isDisponibilidad()){
                        System.out.println("La puta silla ya esta ocupada");
                    }
                }
            }
        }  
    }   
}
