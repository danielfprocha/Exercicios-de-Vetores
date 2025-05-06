import java.util.Scanner;

public class Exercicio10 {
    // Preencha um vetor com 10 números inteiros aleatórios fornecidos pelo usuário. Ordene os elementos em ordem crescente (utilize um algoritmo simples, como o Bubble Sort). Exiba o vetor ordenado.

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = teclado.nextInt();
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        teclado.close();
    }  
}
