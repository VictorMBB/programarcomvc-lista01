import java.util.Scanner;

/*Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o
dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça
corresponde a 2, e assim por diante. Utilizando Array.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero para ver o dia correspondente: ");
        numero = sc.nextInt();
        numero = numero - 1;

        System.out.println("O dia da semana e: "+ weekDay(numero));

        sc.close();
    }

    public static String weekDay(int num){
        String[] diaSemana = {"Segunda",
                                "Terça",
                                "Quarta",
                                "Quinta",
                                "Sexta",
                                "Sábado",
                                "Domingo"};

        return diaSemana[num];
    }
}