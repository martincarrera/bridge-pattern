package implementors;

public interface IMotor {

    void inyectarCombustible(double cantidad);
    void consumirCombustible();
    String getTipo();
}
