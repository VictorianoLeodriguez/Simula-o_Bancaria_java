
import java.util.Scanner;

    public class contaTerminal{
        public static void main(String[] args) throws Exception{

            Scanner scanner = new Scanner(System.in);
                System.out.println("Qual Sua Agência?");
                    String Agencia = scanner.nextLine();
                System.out.println("Qual Seu Número de Agência?");
                    int Numero = scanner.nextInt();
            scanner.nextLine();
                System.out.println("Qual seu Usuario?");
                    String Cliente = scanner.nextLine();
                System.out.println("Qaul seu saldo atual?");
                    double Saldo = scanner.nextDouble();

        scanner.close();
            String Mensagem = " Olá " + Cliente + ", obrigado pro criar uma conta em nosso banco, Sua agência é " + Agencia + " Conta " + Numero + " Seu saldo de " + Saldo + " R$ já está Disponivel para Saque, tenho um Otimo dia, Obrigada ";
            
                System.out.println(Mensagem);
        }

    }
