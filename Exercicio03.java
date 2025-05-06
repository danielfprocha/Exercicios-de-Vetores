import java.util.Scanner;

public class Exercicio03 {
    // Faça um programa que leia um vetor de 20 inteiros. Conte e exiba quantos desses números são pares.
    public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);

    int[] vetor = new int[20];
    int i = 0;
    int numPares = 0;

    for (i = 0; i < vetor.length; i++) {
    System.out.println("Digite o " + (i + 1) +"° número do vetor: ");
    vetor[i] = teclado.nextInt();
    if (vetor[i] % 2 == 0) {
        numPares += 1;
        }    
    }

    System.out.printf("Nesse vetor há %d números pares.\n", numPares);

    teclado.close();
    }
}
