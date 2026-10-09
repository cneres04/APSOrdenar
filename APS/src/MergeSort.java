public class MergeSort {
    private int[] vetor;
    private double tempoExecucaoMs;
    private int quantidadeElementos;
    private boolean ordenadoSucesso;

    public MergeSort(int[] vetor) {

        this.vetor = vetor.clone();
        this.quantidadeElementos = this.vetor.length;


        ordenar();


        this.ordenadoSucesso = verificarOrdenacao();
    }

    private void ordenar() {
        long inicio = System.nanoTime();

        executarMergeSort(this.vetor, 0, this.vetor.length - 1);

        long fim = System.nanoTime();
        this.tempoExecucaoMs = (fim - inicio) / 1_000_000.0;
    }

    private void executarMergeSort(int[] v, int comeco, int fim) {
        if (comeco < fim) {
            int meio = (fim + comeco) / 2;

            executarMergeSort(v, comeco, meio);
            executarMergeSort(v, meio + 1, fim);

            merge(v, comeco, meio, fim);
        }
    }

    private void merge(int[] v, int comeco, int meio, int fim) {
        int posicao1 = comeco;
        int posicao2 = meio + 1;
        int posicaoAux = 0;
        int tam = fim - comeco + 1;

        int[] vetAux = new int[tam];

        while (posicao1 <= meio && posicao2 <= fim) {
            if (v[posicao1] < v[posicao2]) {
                vetAux[posicaoAux] = v[posicao1];
                posicao1++;
            } else {
                vetAux[posicaoAux] = v[posicao2];
                posicao2++;
            }
            posicaoAux++;
        }


        while (posicao1 <= meio) {
            vetAux[posicaoAux] = v[posicao1];
            posicaoAux++;
            posicao1++;
        }


        while (posicao2 <= fim) {
            vetAux[posicaoAux] = v[posicao2];
            posicaoAux++;
            posicao2++;
        }

        for (posicaoAux = comeco; posicaoAux <= fim; posicaoAux++) {
            v[posicaoAux] = vetAux[posicaoAux - comeco];
        }
    }


    private boolean verificarOrdenacao() {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Getters para relatórios e comparações
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


    public void exibirRelatorioMergeSort(String nomeArquivo) {
        System.out.println("   RELATÓRIO DE EXECUÇÃO: MERGE SORT");
        System.out.println("========================================");
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Quantidade de dados ordenados: " + quantidadeElementos);
        System.out.println("Status da ordenação: " + (ordenadoSucesso ? "CORRETO (Ordenado)" : "ERRO (Não ordenado)"));
        System.out.println("Tempo de execução: " + String.format("%.4f", tempoExecucaoMs) + " ms");
        System.out.println("\n");
    }
}