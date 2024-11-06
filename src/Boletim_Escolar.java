import java.util.Scanner;

    public class Boletim_Escolar{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a sua média ");
            double nota = scanner.nextInt();

            if (nota >=7) {
                System.out.println("Aprovado!");
            }
            else if (nota >=5 && nota <=6.9)
            {
                System.out.println("Você está de exame!");
            }
            else
            {
                System.out.println("Rerovado!");
            }

        }

    }
