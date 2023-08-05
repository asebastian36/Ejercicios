package repositories;

/**
 *
 * @author angel
 */

public interface ICalculadoraRepository {
    public double suma(double operador1, double operador2);
    public double resta(double operador1, double operador2);
    public double multiplicacion(double operador1, double operador2);
    public double division(double operador1, double operador2);
}
