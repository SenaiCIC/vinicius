
package aula05;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Qual é seu nome?");
            String nome = sc.next();
            String sobrenome = sc.nextLine();
            System.out.println("Seu nome é "+nome+sobrenome);
        sc.close();
        
    }
}
