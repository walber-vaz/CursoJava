package introducao;

public class EstruturaIf {
    public static void main(String[] args) {
        /*
         * idade < 15 - Juvenil
         * idade >= 15 && idade < 18 - Pré-Adulto
         * idade >= 18 && idade < 60 - Adulto
         * idade >= 60 - Idoso
         */

        /*
         * Escopo de variáveis locais e blocos de código
         * 
         * Variáveis locais só podem ser acessadas dentro do bloco de código onde foram
         * criadas.
         * 
         * Variáveis locais criadas dentro de um bloco de código não podem ser acessadas
         * fora do bloco de código.
         * 
         * Todas variáveis locais criadas dentro de um bloco de código devem ser
         * inicializadas antes de serem utilizadas.
         * 
         */
        int idade = 15;
        boolean isJuvenil = idade < 15;
        boolean isPreAdulto = idade >= 15 && idade < 18;
        boolean isAdulto = idade >= 18 && idade < 60;
        boolean isIdoso = idade >= 60;

        String categoria;

        if (isJuvenil) {
            categoria = "Juvenil";
        } else if (isPreAdulto) {
            categoria = "Pré-Adulto";
        } else if (isAdulto) {
            categoria = "Adulto";
        } else if (isIdoso) {
            categoria = "Idoso";
        } else {
            categoria = "Idade inválida";
        }

        System.out.println(categoria);
    }
}
