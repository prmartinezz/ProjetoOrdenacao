package br.com.martinez.projetoordenacao.model;

public class OrdenacaoPorSelecao {

    public static void ordenar(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = vetor[min_idx];
                vetor[min_idx] = vetor[i];
                    vetor[i] = temp;
        }
    }
}