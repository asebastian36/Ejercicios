package repositories;

/**
 *
 * @author angel
 */

public class CalculadoraRepository implements ICalculadoraRepository{
    @Override
    public double suma(double operador1, double operador2) {
        return operador1 + operador2;
    }

    @Override
    public double resta(double operador1, double operador2) {
        return operador1 - operador2;
    }

    @Override
    public double multiplicacion(double operador1, double operador2) {
        return operador1 * operador2;
    }

    @Override
    public double division(double operador1, double operador2) {
        return operador1 / operador2;
    }
}
