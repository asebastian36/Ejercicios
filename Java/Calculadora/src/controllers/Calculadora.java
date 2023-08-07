package controllers;

import domain.Operacion;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import services.CalculadoraService;

/**
 *
 * @author angel
 */
public class Calculadora {

    private Operacion op = new Operacion();

    public void inicio() {
        this.solicitarOperadores();
        this.solicitarOperacion();
        System.out.println("la operacion a realizar es " + op.getOperador1() + " " + op.getOperacion() + " " + op.getOperador2());

        this.operaciones();
        this.redondear();
    }

    public void operaciones() {
        CalculadoraService servicio = new CalculadoraService();
        switch (this.op.getOperacion()) {
            case "+":
                op.setResultado(servicio.suma(op.getOperador1(), op.getOperador2()));
                break;

            case "-":
                op.setResultado(servicio.resta(op.getOperador1(), op.getOperador2()));
                break;

            case "*":
                op.setResultado(servicio.multiplicacion(op.getOperador1(), op.getOperador2()));
                break;

            case "/":
                op.setResultado(servicio.division(op.getOperador1(), op.getOperador2()));
                break;
        }
    }

    private void solicitarOperadores() {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario los dos operadores
        System.out.println("Ingresa el primer operador: ");
        String operador1 = scanner.next();

        System.out.println("Ingresa el segundo operador: ");
        String operador2 = scanner.next();

        // Valida que los operadores tengan un solo decimal o sean enteros
        boolean valido1 = false;
        boolean valido2 = false;

        while (!valido1 || !valido2) {
            if (!operador1.matches("-?\\d+(\\.\\d{0,1})?")) {
                System.out.println("El primer operador debe ser un número.");
                operador1 = scanner.next();
            } else {
                valido1 = true;
            }
            if (!operador2.matches("-?\\d+(\\.\\d{0,1})?")) {
                System.out.println("El segundo operador debe ser un número.");
                operador2 = scanner.next();
            } else {
                valido2 = true;
            }
        }
        op.setOperador1(Double.parseDouble(operador1));
        op.setOperador2(Double.parseDouble(operador2));
    }

    private void solicitarOperacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tipo de operacion ya sea +, -, * o /:");
        String operacion = scanner.next();

        boolean valido = false;
        while (!valido) {
            if (!isOperador(operacion)) {
                System.out.println("El operador debe ser +, -, * o /:");
                operacion = scanner.next();
            } else {
                valido = true;
            }

            op.setOperacion(operacion);
        }
    }

    private boolean isOperador(String operador) {
        if (operador.length() != 1) {
            return false;
        }

        char c = operador.charAt(0);

        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private void redondear() {
        double resultado = op.getResultado();
        //  redondear
        BigDecimal bd = new BigDecimal(resultado);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        resultado = bd.doubleValue();

        //  mandar a salida
        String formatoSalida = String.format("%.2f", resultado);
        op.setResultado(resultado);
        System.out.println("El resultado es: " + formatoSalida);
    }
}
