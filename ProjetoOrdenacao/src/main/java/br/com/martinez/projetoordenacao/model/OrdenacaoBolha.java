package br.com.martinez.projetoordenacao.model;

public class OrdenacaoBolha {

    public static void ordenar(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                            vetor[j + 1] = temp;
                }
            }
        }
    }
}