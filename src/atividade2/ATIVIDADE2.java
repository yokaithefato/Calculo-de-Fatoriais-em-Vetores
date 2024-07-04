
package atividade2;

import java.util.Scanner;

public class ATIVIDADE2 {

    
    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int[] vetorA = new int[6];
        int[] vetorB = new int[6];

      
        System.out.println("Digite os 6 elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

      
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = calcularFatorial(vetorA[i]);
        }

       
        System.out.println("Vetor B (fatoriais dos elementos de A):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
