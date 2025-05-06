import java.util.Scanner;

public class Exercicio09 {
    // Preencha dois vetores (tamanho 6 cada) com números inteiros. Gere um terceiro vetor contendo apenas os elementos comuns aos dois primeiros.

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6]; 
        int tamanhoC = 0;

        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < 6; i++) {
            System.out.println("A[" + i + "]: ");
            A[i] = teclado.nextInt();
        }

        System.out.println("\nDigite 6 números para o vetor B:");
        for (int i = 0; i < 6; i++) {
            System.out.println("B[" + i + "]: ");
            B[i] = teclado.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (A[i] == B[j]) {
                    boolean jaExiste = false;
                    for (int k = 0; k < tamanhoC; k++) {
                        if (C[k] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        C[tamanhoC] = A[i];
                        tamanhoC++;
                    }
                }
            }
        }

        System.out.println("\nElementos comuns aos vetores A e B:");
        if (tamanhoC == 0) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int i = 0; i < tamanhoC; i++) {
                System.out.println("C[" + i + "]: " + C[i]);
            }
        }

        teclado.close();
    }  
}