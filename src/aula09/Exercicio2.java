
package aula09;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Quantos números quer somar?");
            int q = sc.nextInt();
            int c = 0;
            double res = 0;
                while ( c < q){
                    System.out.println("Digite o "+(c+1)+"ºnúmero");
                        double r = sc.nextDouble();
                             res = r + res;
                             c++;
                }
            System.out.println("A soma é "+ res);    
    }
}
