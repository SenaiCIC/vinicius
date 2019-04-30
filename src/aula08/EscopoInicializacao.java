
package aula08;

public class EscopoInicializacao {
    public static void main(String[] args) {
        int global = 3;
        String nome;
            if(global > 5){
                //String nome = "Xuxu" <- daria erro pois foi declarada dentro do if
            nome = "Xuxu";
            }else{ 
            nome = "Adailton";
        }
        System.out.println(global);
        System.out.println(nome);
    }
}    
