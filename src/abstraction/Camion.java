package abstraction;

import implementors.IMotor;

public class Camion extends Vehiculo {

    private int capacidadDeCarga;

    public Camion(IMotor motor, String modelo, int capacidadDeCarga) {
        super(motor, modelo);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Soy un CAMION de modelo " + this.getModelo() + ", motor de tipo "
                + this.getMotor().getTipo() + " con " + this.capacidadDeCarga + " litros de carga");
    }
}
