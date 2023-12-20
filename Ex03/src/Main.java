import java.util.Scanner;

/*Crie uma classe e na função main() implemente um programa que lê um número
        inteiro do teclado e imprime todos os números primos menores que ele
        (divisíveis por 1 ou por ele mesmo).*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        for(int i = 2; i < num; i++){
            if(i == 2 || i == 3 || i == 5 || i == 7){
                System.out.print(i+" ");
            }else if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}