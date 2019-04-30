
package aula06;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "mesa";
        int indade = 30;
        int codigo = 3200;
        char sexo = 'f';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        System.out.print(produto1+"com preço de R$"+"%.2f%n");
        System.out.println(produto2+"com preço de R$"+"%.2f%n");
        System.out.printf("%.8f%n", medida);
        System.out.printf("%.3f%n", medida);
        
    }
}
