
package aula06;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Digite sua nota:");
            double nota1 = sc.nextDouble();
            System.out.println("Digite outra nota:");
            double nota2 = sc.nextDouble();
            System.out.println("Digite outra nota:");
            double nota3 = sc.nextDouble();
            System.out.println("Digite outra nota:");
            double nota4 = sc.nextDouble();
                double med = (nota1 + nota2 + nota3 + nota4)/4;
                System.out.println("Sua media é:"+ med);
                    if (med < 5.0){
                        System.out.println("Reprovado");
                    }
                    if (med >= 5.0 && med <6.0){
                        System.out.println("Recuperação");
                    }
                    if (med >= 6.0){
                        System.out.println("Aprovado");
                    }
        
    }
}
