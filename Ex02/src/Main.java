import java.util.Scanner;

// Faça um programa que receba 2 valores e retorne o maior entre eles.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1,valor2;

        System.out.print("Digite dois valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        System.out.println("O maior valor e: "+ checarMaior(valor1,valor2));

        sc.close();
    }

    public static int checarMaior(int valor1, int valor2){
        if(valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}