public class InsertionSort {
    private int[] vetor;
    private double tempoExecucaoMs;
    private int quantidadeElementos;
    private boolean ordenadoSucesso;

    public InsertionSort(int[] vetor) {

        this.vetor = vetor.clone();
        this.quantidadeElementos = this.vetor.length;

        ordenar();

        this.ordenadoSucesso = verificarOrdenacao();
    }

    private void ordenar() {
        int tam = vetor.length;
        int i, j, chave;

        long inicio = System.nanoTime();

        for (j = 1; j < tam; j++) {
            chave = vetor[j];
            i = j - 1;

            while (i >= 0 && vetor[i] > chave) {
                vetor[i + 1] = vetor[i];
                i--;
            }

            vetor[i + 1] = chave;
        }

        long fim = System.nanoTime();
        this.tempoExecucaoMs = (fim - inicio) / 1_000_000.0;
    }


    private boolean verificarOrdenacao() {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false; // Se encontrar algum elemento maior que o seguinte, falhou
            }
        }
        return true;
    }

    // Getters para relatórios e comparações futuras
    public double getTempoExecucaoMs() {
        return tempoExecucaoMs;
    }

    public int getQuantidadeElementos() {
        return quantidadeElementos;
    }

    public boolean isOrdenadoSucesso() {
        return ordenadoSucesso;
    }

    public int[] getVetor() {
        return vetor;
    }


    public void exibirRelatorioInsertionSort(String nomeArquivo) {
        System.out.println("   RELATÓRIO DE EXECUÇÃO: INSERTION SORT");
        System.out.println("========================================");
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Quantidade de dados ordenados: " + quantidadeElementos);
        System.out.println("Status da ordenação: " + (ordenadoSucesso ? "CORRETO (Ordenado)" : "ERRO (Não ordenado)"));
        System.out.println("Tempo de execução: " + String.format("%.4f", tempoExecucaoMs) + " ms");
        System.out.println("\n");
    }
}