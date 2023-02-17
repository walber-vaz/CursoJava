package introducao;

public class OperadoresLogico {
    public static void main(String[] args) {
        // Operadores Logicas
        // && = E
        // || = OU
        // ! = NAO

        int idade = 29;
        float salario = 3500f;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // Operador OU
        double valorTotalContaCorrente = 300;
        double valorTotalContaPoupanca = 10000;

        float valorInvestimento = 5000f;

        boolean isValorTotalMaiorQue5000 = valorTotalContaCorrente > valorInvestimento
                || valorTotalContaPoupanca > valorInvestimento;

        System.out.println("isValorTotalMaiorQue5000: " + isValorTotalMaiorQue5000);

        // Operador NAO
        boolean isCrianca = true;
        boolean isNaoCrianca = !isCrianca;

        System.out.println("isCrianca: " + isCrianca);
        System.out.println("isNaoCrianca: " + isNaoCrianca);
    }
}
