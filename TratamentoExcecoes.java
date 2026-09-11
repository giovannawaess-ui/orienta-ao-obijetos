
import java.util.Scanner;

public class TratamentoExcecoes {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int anos = 0;
        double paisA, paisB = 5000000;
        double taxaA;

        try {

            paisA = Integer.parseInt(args[0]);

            System.out.print("Digite a taxa de natalidade do país A (%): ");
            taxaA = s.nextDouble();

            taxaA = taxaA / 100;
            double taxaB = 0.04;

            while (paisB <= paisA) {

                paisA = paisA + (paisA * taxaA);
                paisB = paisB + (paisB * taxaB);

                anos++;
            }

            System.out.println("País A: " + paisA);
            System.out.println("País B: " + paisB);
            System.out.println("Tempo necessário: " + anos + " anos.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: falta o parâmetro da população do país A na linha de comando (args[]).");

        } catch (InputMismatchException e) {

            System.out.println("Erro: a taxa de natalidade deve ser informada como um número.");

        }

        s.close();
    }
}