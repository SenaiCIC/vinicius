
package aula07;

public class OperaçõesComString {
    public static void main(String[] args) {
        String n = "Vinicius";
        String nM = n.toUpperCase();
            System.out.println("maiusculo:"+ nM);
        String nm = n.toLowerCase();
            System.out.println("minusculo:"+ nm);
        String rec = "Senai CIC é o melhor curso do Brasil";
        String sub = rec.substring(5, 31);
            System.out.println("sub ="+ sub);
        String rep = rec.replace("Brasil", "mundo");
            System.out.println("replace="+ rep);
        int loc = rec.indexOf("ai");
            System.out.println("Localizado ="+ loc);
        loc = rec.lastIndexOf("si");
            System.out.println("Localizado ="+ loc);
        String sp = "laranja maçã banana";
        String[] vect = sp.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
    }
}
