import resources.Circulo;

import java.util.Scanner;

/*Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI *
r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser
arredondado.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.printf("A area do circulo e: "+circulo.getArea());

        sc.close();
    }
}