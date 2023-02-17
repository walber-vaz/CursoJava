package exercicio;

/*
 * Crie variáveis para os tipos primitivos e imprima seus valores com seguinte frase:
 * 
 * Eu <name>. morando no endereço <address> confirmo que recebi o valor de R$ <value> reais. na data <date>
 */

public class TiposPrimitivosEx {
    public static void main(String[] args) {
        String name = "Walber";
        String address = "Rua 1, 123";
        double salary = 5250.45D;
        String dateReceiptSalary = "17/02/2023";

        System.out.println("Eu " + name + ". morando no endereço " + address + " confirmo que recebi o valor de R$ "
                + salary + " reais. na data " + dateReceiptSalary);
    }
}
