
package aula07;

import java.util.Scanner;

public class ConditionalCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
       int dia = sc.nextInt();
       String dsemana;
            switch(dia){
                case 1:
                    dsemana = "Domingo";
                    break;
                case 2:
                    dsemana = "Segunda";
                    break;
                case 3:
                    dsemana = "Terça";
                    break;
                case 4:
                    dsemana = "Quarta";
                case 5:
                    dsemana = "Quinta";
                    break;
                case 6:
                    dsemana = "Sexta";
                    break;
                case 7:
                    dsemana = "Sabado";
                    break;
                default:
                    dsemana = "Número invalido";
                    break;
            }
            System.out.println(dsemana);
    }
}
