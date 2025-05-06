import java.util.Scanner;

public class Exercicio02 {
    // Crie um vetor de tamanho 15 preenchido com números inteiros fornecidos pelo usuário.Imprima o maior valor presente no vetor e sua posição (índice)
    public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);

    int[] vetor = new int[15];
    int i = 0;

    for (i = 0; i < vetor.length; i++) {
    System.out.println("Digite o " + (i + 1) +"° número do vetor: ");
    vetor[i] = teclado.nextInt();
    }

    int maiorNumero = vetor[0];
    int indice = 0;

    for (i = 0; i < vetor.length; i++) {
        if (vetor[i] > maiorNumero) {
             maiorNumero = vetor[i];
             indice = i;
        } 
    }

    System.out.printf("O maior número desse vetor é o %d. \nO índice desse número no vetor é %d.", maiorNumero, indice);

    teclado.close();
    }
}
