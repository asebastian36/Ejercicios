package services;

import repositories.CalculadoraRepository;
import repositories.ICalculadoraRepository;

/**
 *
 * @author angel
 */

public class CalculadoraService {
    ICalculadoraRepository repositorio = new CalculadoraRepository();
    
    public double suma(double operador1, double operador2) {
        return repositorio.suma(operador1, operador2);
    }
    
    public double resta(double operador1, double operador2) {
        return repositorio.resta(operador1, operador2);
    }
    
    public double multiplicacion(double operador1, double operador2) {
        return repositorio.multiplicacion(operador1, operador2);
    }
    
    public double division(double operador1, double operador2) {
        return repositorio.suma(operador1, operador2);
    }
}
