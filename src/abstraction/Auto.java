package abstraction;

import implementors.IMotor;

public class Auto extends Vehiculo {

    private int pasajeros;

    public Auto(IMotor motor, String modelo, int pasajeros) {
        super(motor, modelo);
        this.pasajeros = pasajeros;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Soy un AUTO de modelo " + this.getModelo() + ", motor de tipo " + this.getMotor().getTipo()
                + " y espacio para " + this.pasajeros + " pasajeros");
    }
}
