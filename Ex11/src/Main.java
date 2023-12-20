import java.util.Scanner;

/*Escreva um programa que tenha duas palavras como entrada, e a saída imprima as
palavras em ordem alfabética (utilize o método compareTo da classe String),. Informe
também, qual das palavras tem o maior número de caracteres.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1, word2;

        System.out.print("Digite duas palavras: ");
        word1 = sc.next();
        word2 = sc.next();

        if(word1.compareTo(word2) < 1){
            System.out.println(word1+" "+word2);
        } else {
            System.out.println(word2+" "+word1);
        }
        compareStringLength(word1,word2);

        sc.close();
    }

    public static void compareStringLength(String word1, String word2){
        if(word1.length() > word2.length()){
            System.out.println(word1+" tem mais caracteres");
        } else if(word2.length() > word1.length()) {
            System.out.println(word2+" tem mais caracteres");
        } else {
            System.out.println("As duas palavras tem o mesmo tamanho");
        }
    }
}