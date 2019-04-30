
package aula08;

import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
            System.out.println("Digite seu nome:");
                String nome = sc.next();
            System.out.println("Digite quanto quer depositar:");
                double dp = sc.nextDouble();
                double ndp = 0.0;
            System.out.println("------------------");
            System.out.println("       MENU       ");
            System.out.println("------------------");
            System.out.println("1 - Novo Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            int escolha = sc.nextInt();
                switch(escolha){
                    case 1:
                        System.out.println("Quanto deseja depositar?");
                            ndp = sc.nextDouble();
                            ndp = ndp + dp;
                        System.out.println(ndp);
                        break;
                    case 2:
                        System.out.println("Quanto quer sacar?");
                            double saq = sc.nextDouble();
                            saq = dp - saq;
                        System.out.println("Operação concluida, você"
                                    + "sacou" +saq+" e ficou com um saldo de," +ndp);
                        break;
                    case 3:
                        System.out.println(ndp);
                        break;
                }
        sc.close();
    }
 
}
