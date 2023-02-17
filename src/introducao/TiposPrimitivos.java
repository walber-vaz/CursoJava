package introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos
        // int, double, float, char, boolean, byte, short, long

        // Variáveis
        // Regras:
        // 1 - Não pode começar com número
        // 2 - Não pode conter caracteres especiais
        // 3 - Não pode ser uma palavra reservada
        // 4 - Não pode conter espaços
        // 5 - Não pode conter acentos
        // 6 - Não pode começar com letra maiúscula
        // 7 - Palavras compostas devem ser separadas por letra maiúscula

        /*
         * Tamanho numérico dos tipos primitivos
         * byte: 1 byte
         * short: 2 bytes
         * int: 4 bytes
         * long: 8 bytes
         * float: 4 bytes
         * double: 8 bytes
         * char: 2 bytes
         * boolean: 1 bit
         * 
         * Tamanho range dos tipos primitivos
         * byte: -128 a 127
         * short: -32768 a 32767
         * int: -2147483648 a 2147483647
         * long: -9223372036854775808 a 9223372036854775807
         * float: 1.4E-45 a 3.4028235E38
         * double: 4.9E-324 a 1.7976931348623157E308
         * char: 0 a 65535
         * boolean: true ou false
         * 
         * Default values
         * byte: 0
         * short: 0
         * int: 0
         * long: 0
         * float: 0.0
         * double: 0.0
         * char: '\u0000'
         * boolean: false
         */

        int age = 30;
        double salary = 4000.0;
        float salaryFloat = 4000.0f;
        char caractere = 'A';
        byte ageByte = 30;
        short ageShort = 30;
        long ageLong = 1000000000000000000L;
        boolean isTrue = true;

        System.out.println("Idade: " + age);
        System.out.println("Salário: " + salary);
        System.out.println("Salário float: " + salaryFloat);
        System.out.println("Caractere: " + caractere);
        System.out.println("Byte: " + ageByte);
        System.out.println("Short: " + ageShort);
        System.out.println("Long: " + ageLong);
        System.out.println("Boolean: " + isTrue);
    }
}
