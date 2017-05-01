package implementors;

public class Nafta implements IMotor {

    @Override
    public void consumirCombustible() {
        this.realizarCombustion();
    }

    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + "ml. de Nafta");
    }

    @Override
    public String getTipo() {
        return "Naftero";
    }

    public void realizarCombustion() {
        System.out.println("Realizada la combustion de Nafta");
    }
}
