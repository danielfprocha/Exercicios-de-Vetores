import java.util.Scanner;
public class Exercicio05 {
    // Crie um programa que receba 12 números em um vetor. Calcule a média dos valores. Exiba quantos elementos são maiores que a média calculada.
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] vetor = new int [12];
        int i = 0;
        double soma = 0;
        double media = 0;
        int acimaMedia = 0;

        for (i = 0; i < vetor.length; i++) {
        System.out.println("Digite o " + (i + 1) + "° do vetor: ");
        vetor[i] = teclado.nextInt();
        soma += vetor[i];
        }

        media = soma/vetor.length;

        for (i = 0; i < vetor.length; i++) {
        if (vetor[i] > media) {
            acimaMedia++;
        }
        }

        System.out.printf("A média dos números desse vetor é de %.2f. \n%d números desse vetor são maiores do que a média. \n", media, acimaMedia);

        teclado.close();
    }
}