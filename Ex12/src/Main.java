import java.util.Scanner;

/*Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um
motorista monitorou vários tanques cheios de gasolina registrando a quilometragem
dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os
litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa
deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e
imprimir a quilometragem combinada e a soma total de litros de combustível
consumidos até esse ponto. Todos os cálculos de média devem produzir resultados de
ponto flutuante.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tanqueCheio;
        System.out.print("Quantos tanques foram usados na viagem? ");
        tanqueCheio = sc.nextInt();

        int[] quilometrosPorTanque = new int[tanqueCheio];
        int[] litrosPorTanque = new int[tanqueCheio];

        for(int i = 0; i < tanqueCheio; i++){
            System.out.printf("Quantos quilometros foram dirigidos no tanque %d#? ",(i+1));
            quilometrosPorTanque[i] = sc.nextInt();

            System.out.printf("Quantos litros foram consumidos no tanque %d#? ",(i+1));
            litrosPorTanque[i] = sc.nextInt();
        }

        int somaQuilometro = 0;
        int somaLitro = 0;
        for(int i = 0; i < tanqueCheio; i++){
            float mediaKmLitro;

            mediaKmLitro = (float)quilometrosPorTanque[i]/litrosPorTanque[i];
            somaQuilometro += quilometrosPorTanque[i];
            somaLitro += litrosPorTanque[i];

            System.out.printf("Consumo Km/Litro do tanque %d: ",(i+1));
            System.out.printf("%.2f Km/litro %n",mediaKmLitro);
        }
        System.out.println("Distancia total: "+ somaQuilometro+" Km");
        System.out.println("Consumo total de combustível: "+ somaLitro+" litros");

        sc.close();
    }
}