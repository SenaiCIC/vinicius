
package aula06;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Que horas vem o bonde?");
            int hora  = sc.nextInt();
            if (hora < 12){
                System.out.println("Good Morning");
            }
            if (hora >= 12 && hora < 18){
                System.out.println("Good Efthernoom");
            }
            if (hora >= 18){
                System.out.println("Good Look e que God te proteja");
            }
            sc.close();
            
            
    }
}
