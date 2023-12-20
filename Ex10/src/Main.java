import java.util.Scanner;

/*Escreva uma classe que conte a quantidade de vogais, espaços em brancos e
consoantes de uma cadeia de caracteres.*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence;
        int countVogal = 0, countSpace = 0, countConsoante = 0;

        System.out.print("Escreva uma frase: ");
        sentence = sc.nextLine();

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'a' ||
                    sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u'){
                countVogal++;
            } else if(sentence.charAt(i) == ' '){
                countSpace++;
            } else {
                countConsoante++;
            }
        }

        System.out.printf("Sua frase tem %d vogais, %d espaços em branco " +
                "e %d consoantes",countVogal,countSpace,countConsoante);

        sc.close();
    }
}