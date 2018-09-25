
package ejerciciosrelaciones1;

import java.util.ArrayList;

public class Carro {
    
    private String marca;
    private String referencia;
    private ArrayList<Ruedas> ruedas;
    private Motor motor;
    private Chasis chasis;

    public Carro(String marca, String referencia){
        this.marca = marca;
        this.referencia= referencia;
        this.chasis = new Chasis(2409);
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    

    public ArrayList<Ruedas> getRuedas() {
        return ruedas;
    }

    public Motor getMotor() {
        return motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setRuedas(ArrayList<Ruedas> ruedas) {
        this.ruedas = ruedas;
    }

  

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
