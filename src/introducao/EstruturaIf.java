package introducao;

public class EstruturaIf {
    public static void main(String[] args) {
        int age = 32;
        boolean isAutorizado = age >= 18;

        if (!isAutorizado) {
            System.out.println("Pode tira carteira de motorista");
        } else {
            System.out.println("Não pode tira carteira de motorista");
        }
    }
}
