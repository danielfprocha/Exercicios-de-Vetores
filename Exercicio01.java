import java.util.Scanner;

public class Exercicio01 {
    //Crie um vetor com 10 números inteiros.
    // Escreva um programa que calcule e imprima a soma dos elementos desse vetor.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Soma dos valores de um vetor");

        int[] vetor = new int[10];
        int i = 0;
        int soma = 0;

        for (i = 0; i < vetor.length; i++) {
            System.out.println("Número "+(i + 1)+": ");
            vetor[i] = teclado.nextInt();
            soma = soma + vetor[i];
        }

    System.out.println("A soma dos valores do vetor é: " + soma);

    teclado.close();
 }
}