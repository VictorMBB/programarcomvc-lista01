import java.util.Scanner;

/*Pretende-se escrever um programa que leia do teclado uma distância expressa em
milhas, converte-a para quilômetros e apresenta o resultado no console. (fórmula de
conversão: 1 milha = 1.609 km).*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distance;

        System.out.print("Digite a distância em milhas para conversão: ");
        distance = sc.nextDouble();

        System.out.println("Distancia em Km: "+ conversionMilesKm(distance));

        sc.close();
    }

    public static double conversionMilesKm(double distanceInMiles){
        double distanceInKm;
        distanceInKm = distanceInMiles/1.609;

        return distanceInKm;
    }
}