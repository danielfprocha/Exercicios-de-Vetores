import java.util.Scanner;
public class Exercicio04 {
    // Leia um vetor de 8 elementos do usuário. Mostre o vetor na ordem inversa da entrada.
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[] vetor = new int [8];
        int i = 0;

    for (i = 0; i < vetor.length; i++) {
        System.out.println("Digite o " + (i + 1) + "° número do vetor: ");
        vetor[i] = teclado.nextInt();
    }

    System.out.printf("O vetor na ordem inversa fica assim: \n%d \n%d \n%d \n%d \n%d \n%d \n%d \n%d", vetor[7], vetor[6], vetor[5], vetor[4], vetor[3], vetor[2], vetor[1], vetor[0]);
        teclado.close();
    }  
}
