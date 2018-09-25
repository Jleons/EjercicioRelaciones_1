
package ejerciciosrelaciones1;

import java.util.ArrayList;



public class Persona {
    private String nombre;
    private ArrayList<Carro> carros;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void mostrarCarros(){
        System.out.println("Bienvenido, " + getNombre());
        System.out.println("Carros en posesion");
        for(int i=0; i<carros.size(); i++){
            System.out.println(" ");
            System.out.println("Carro N°" + (i+1));
            System.out.println(" ");
            System.out.println(carros.get(i).getMarca()+" "+carros.get(i).getReferencia());
            System.out.println("Marca llantas: "+ carros.get(i).getRuedas().get(i).getMarca());
            System.out.println("Duracion: "+carros.get(i).getRuedas().get(i).getDuration());
            System.out.println("Potencia motor: "+carros.get(i).getMotor().getPotencia()+" CV");
            System.out.println("Revoluciones del motor: "+carros.get(i).getMotor().getRevoluciones()+" rpm");
            System.out.println("Numero del chasis: "+carros.get(i).getChasis().getCodigoserie());
        }
    }
}


