import java.util.Scanner;

@FunctionalInterface
interface Operacao {
    int multiplicacao(int a , int b);
}

public class LambdaMultiplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        Operacao operacao = (a,b) -> a * b;

        int resultado = operacao.multiplicacao(numero1,numero2);


        System.out.println("O resultado da multiplicação é " + resultado);

        scanner.close();

        exibirMensagemDeSaida();
    }
    public static void exibirMensagemDeSaida() {
        System.out.println("\n" + "=".repeat(22) + " 🐱✨ Programa encerrado! ✨🐱 " + "=".repeat(20));
        System.out.println("Desenvolvido por: Jeisa Boaventura");
        System.out.println("GitHub: https://github.com/Caaarolb");
        System.out.println("LinkedIn: https://www.linkedin.com/in/-caroline-boaventura/");
        System.out.println("=" + "=".repeat(68) + "\n");
    }
}
