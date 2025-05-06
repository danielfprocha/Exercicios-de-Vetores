import java.util.Scanner;

public class Exercicio07 {
    // Crie um programa que preencha um vetor de tamanho 15. Peça ao usuário um número e conte quantas vezes esse número aparece no vetor.
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] vetor = new int[15];
        int numeroBuscado;
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println("Digite o número que deseja contar no vetor: ");
        numeroBuscado = teclado.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.printf("O número %d aparece %d vez(es) no vetor.\n", numeroBuscado, contador);

        teclado.close();
    }  
}
