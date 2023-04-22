package br.com.martinez.projetoordenacao;

import java.util.Scanner;
import br.com.martinez.projetoordenacao.model.OrdenacaoBolha;
import br.com.martinez.projetoordenacao.model.OrdenacaoPorInsercao;
import br.com.martinez.projetoordenacao.model.OrdenacaoPorSelecao;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Escolha um método de ordenação: ");
        System.out.println("1 - Ordenação por inserção");
        System.out.println("2 - Ordenação por seleção");
        System.out.println("3 - Ordenação bolha");
        int opcao = scanner.nextInt();
        long tempoInicial = System.currentTimeMillis();
        switch (opcao) {
        case 1:
            OrdenacaoPorInsercao.ordenar(vetor);
                System.out.println("Ordenação por inserção: ");
                    imprimirVetor(vetor);
                        break;
        case 2:
            OrdenacaoPorSelecao.ordenar(vetor);
                System.out.println("Ordenação por seleção: ");
                    imprimirVetor(vetor);
                        break;
        case 3:
            OrdenacaoBolha.ordenar(vetor);
                System.out.println("Ordenação bolha: ");
                    imprimirVetor(vetor);
                        break;
        default:
            System.out.println("Opção inválida");
                break;
        }
        
        long tempoFinal = System.currentTimeMillis();
        long tempoExecucao = tempoFinal - tempoInicial;
        System.out.println("Vetor original :");
        imprimirVetor(vetor);
        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
        System.out.println("Tempo de execução: " + tempoExecucao + "ms");
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println();
    }
}
