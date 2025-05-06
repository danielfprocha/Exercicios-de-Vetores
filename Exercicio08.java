import java.util.Scanner;

public class Exercicio08 {
    // Leia dois vetores A e B de tamanho 5 cada um. Crie e exiba um terceiro vetor C que seja a união dos elementos dos vetores A e B.

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]: ");
            A[i] = teclado.nextInt();
        }

        System.out.println("\nDigite 5 números para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "]: ");
            B[i] = teclado.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i];       
            C[i + 5] = B[i];   
        }

        System.out.println("\nVetor C (união de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

        teclado.close();
    }  
}
