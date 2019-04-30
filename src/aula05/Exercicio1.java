package aula05;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero inteiro:");
            int x = sc.nextInt();
            System.out.println("Digite outro numero:");
            int z = sc.nextInt();
            int result = x + z;
            System.out.println("A soma dos dois numeros é: "+ result);
        sc.close();
    }
    
}