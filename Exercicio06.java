import java.util.Scanner;
public class Exercicio06 {
    // Dado um vetor com 10 elementos, peça ao usuário um número para remover. Após remover o número escolhido (primeira ocorrência), mostre o vetor resultante.
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int[] vetor1 = new int [10];
        int[] vetor2 = new int [9];
        int i = 0;
        int j = 0;
        int numRemovido = 0;
        boolean removido = false;

        for (i = 0; i < vetor1.length; i++) {
        System.out.println("Digite o " + (i + 1) + "° número do vetor: ");
        vetor1[i] = teclado.nextInt();
        }

        System.out.println("Digite um número do vetor que você deseja excluir (caso o número seja repetido, o primero será o excluído): ");
        numRemovido = teclado.nextInt();

        for (i = 0; i < vetor1.length; i++) {
            if (!removido && vetor1[i] == numRemovido) {
                removido = true;
                continue; 
            }
            if (j < vetor2.length) {
                vetor2[j] = vetor1[i];
                j++;
            }
        }

        if (removido) {
            for (int k = 0; k < vetor2.length; k++) {
                System.out.printf("O %d° número do vetor atualizado é: %d\n", k + 1, vetor2[k]);
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }


        teclado.close();
    }
}