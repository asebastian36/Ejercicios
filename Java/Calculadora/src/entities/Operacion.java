package entities;

/**
 *
 * @author angel
 */

public class Operacion {
    private double operador1;
    private double operador2;
    private String operacion;
    private double resultado;

    public Operacion(double operador1, double operador2, String operacion) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.operacion = operacion;
    }
    
    public Operacion() {
        this.operador1 = 0;
        this.operador2 = 0;
        this.operacion = "";
    }

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
