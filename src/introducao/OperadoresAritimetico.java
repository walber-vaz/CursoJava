package introducao;

public class OperadoresAritimetico {
    public static void main(String[] args) {
        // Operadores Aritméticos
        // +, -, *, /, %, ++, --
        int num1 = 10;
        int num2 = 20;

        System.out.println("Números: " + num1 + " e " + num2);
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        // usando casting para converter int para double
        System.out.println("Divisão: " + ((double) num1 / (double) num2));
        System.out.println("Módulo: " + (num1 % num2));
        System.out.println("Incremento: " + (++num1));
        System.out.println("Decremento: " + (--num2));
    }
}
