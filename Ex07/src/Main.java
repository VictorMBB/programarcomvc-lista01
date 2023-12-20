/*Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
usando os tipos de dados int e double*/
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++){
            double mult3;
            if(i%3 == 0){
                mult3 = i;
                System.out.println(mult3/2);
            }
        }

    }
}