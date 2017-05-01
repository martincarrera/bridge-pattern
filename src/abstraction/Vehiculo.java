package abstraction;

import implementors.IMotor;

public abstract class Vehiculo {

    private IMotor motor;
    private String modelo;

    public Vehiculo(IMotor motor, String modelo) {
        this.motor = motor;
        this.modelo = modelo;
    }

    public void acelerar(double combustible) {
        motor.inyectarCombustible(combustible);
        motor.consumirCombustible();
    }

    public void frenar() {
        System.out.println("El vehiculo esta frenando.");
    }

    public abstract void mostrarCaracteristicas();

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }
}
