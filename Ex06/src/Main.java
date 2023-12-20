/*Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e
float.*/
public class Main {
    public static void main(String[] args) {

        float produtoImpares = 1f;

        for(int i = 15; i < 30; i++){

            if(i%2 == 1){
                produtoImpares *= i;
            }
        }

        System.out.printf("Produto dos impares de 15 a 30: %.2e",produtoImpares);

    }
}