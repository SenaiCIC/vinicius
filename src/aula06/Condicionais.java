
package aula06;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            int res = num%2;
            if(res==0){
                System.out.println("O número é par");
            }else{
                System.out.println("O número é impar");
                
            }    
    }
 
}
