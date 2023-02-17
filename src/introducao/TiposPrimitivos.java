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
