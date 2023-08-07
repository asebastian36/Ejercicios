package services;

/**
 *
 * @author angel
 */

public class CalculadoraService {
    
    public Double suma(Double operador1, Double operador2) {
        return operador1 + operador2;
    }
    
    public Double resta(Double operador1, Double operador2) {
        return operador1 - operador2;
    }
    
    public Double multiplicacion(Double operador1, Double operador2) {
        return operador1 * operador2;
    }
    
    public Double division(Double operador1, Double operador2) {
        return operador1 / operador2;
    }
}
