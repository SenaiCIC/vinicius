
package aula06;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite seu peso: ");
            double peso = sc.nextDouble();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            System.out.printf("Seu nome é %s, sua idade é %d, seu peso é"
                    + "%.2f%n e sua altura é %.2f%n", nome, idade, peso,altura);
            double res = peso/ (altura*altura);
            System.out.println("E seu IMC é"+res);
            
            
    }
}
