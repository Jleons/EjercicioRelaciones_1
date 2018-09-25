  
package ejerciciosrelaciones1;

import java.util.ArrayList;


public class EjerciciosRelaciones1 {

 public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        Persona owner = new Persona("Usuario");
        
        ArrayList<Ruedas> Ruedas_1 = new ArrayList<>();
        ArrayList<Ruedas> Ruedas_2 = new ArrayList<>();
        for(int i=0; i<4; i++){
            Ruedas_1.add(new Ruedas("Continental", "5 years"));
        } 
        for(int i=0; i<4; i++){
            Ruedas_2 .add(new Ruedas("Firestone", "2 years"));
        }

        carros.add(new Carro("Lamborghini ","Aventador" ));
        carros.add(new Carro("Ferrari ","458" ));
        carros.get(0).setRuedas(Ruedas_1);
        carros.get(1).setRuedas(Ruedas_2 );
        carros.get(0).setMotor(new Motor(8250 , 700));
        carros.get(1).setMotor(new Motor(9000 , 570 ));
        
        owner.setCarros(carros);
        
        owner.mostrarCarros();
        
    }
}
