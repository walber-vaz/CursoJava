package introducao;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Operadores Relacionais
        // ==, !=, >, <, >=, <=
        // Operadores lógicos sempre retornam um boolean
        int num1 = 10;
        int num2 = 20;

        System.out.println("Números: " + num1 + " e " + num2);
        System.out.println("Igualdade: " + (num1 == num2));
        System.out.println("Diferença: " + (num1 != num2));
        System.out.println("Maior: " + (num1 > num2));
        System.out.println("Menor: " + (num1 < num2));
        System.out.println("Maior ou igual: " + (num1 >= num2));
        System.out.println("Menor ou igual: " + (num1 <= num2));
    }
}
