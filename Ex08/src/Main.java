import java.util.Scanner;

/*Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da
direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;

        System.out.printf("Digite a palavra: ");
        word = sc.nextLine();

        if(checkPalindromo(word)){
            System.out.println("Esta palavra e um palindromo");
        } else {
            System.out.println("Esta palavra nao e um palindromo");
        }

        sc.close();
    }
    public static boolean checkPalindromo(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}