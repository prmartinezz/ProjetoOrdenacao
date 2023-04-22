package br.com.martinez.projetoordenacao.model;

public class OrdenacaoPorInsercao {

    public static void ordenar(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                    j = j - 1;
            }

            vetor[j + 1] = chave;
        }
    }
}