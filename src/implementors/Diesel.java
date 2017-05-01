package implementors;

public class Diesel implements IMotor {

    @Override
    public void consumirCombustible() {
        this.realizarExplosion();
    }

    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + "ml. de Gasoil");
    }

    @Override
    public String getTipo() {
        return "Diesel";
    }

    public void realizarExplosion() {
        System.out.println("Realizada la explosion de Gasoil");
    }
}
