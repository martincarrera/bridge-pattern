import abstraction.Auto;
import abstraction.Camion;
import abstraction.Vehiculo;
import implementors.Diesel;
import implementors.IMotor;
import implementors.Nafta;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------\n");
        autos();
        System.out.println("\n---------------------\n");
        camiones();
        System.out.println("\n---------------------\n");
    }

    public static void autos() {
        IMotor motorDiesel = new Diesel();
        IMotor motorNafta = new Nafta();

        Vehiculo audiTT = new Auto(motorDiesel, "Audi TT", 2);

        audiTT.acelerar(4.1d);
        audiTT.mostrarCaracteristicas();

        audiTT.setMotor(motorNafta);
        audiTT.acelerar(5.2d);
        audiTT.mostrarCaracteristicas();
    }

    public static void camiones() {
        IMotor motorDiesel = new Diesel();
        IMotor motorNafta = new Nafta();

        Vehiculo scania = new Camion(motorNafta, "Scania", 1200);

        scania.acelerar(1.2d);
        scania.mostrarCaracteristicas();

        scania.setMotor(motorDiesel);
        scania.acelerar(5.2d);
        scania.mostrarCaracteristicas();

    }
}
