public class BucketSort {
    private int[] vetor;
    private double tempoExecucaoMs;
    private int quantidadeElementos;
    private boolean ordenadoSucesso;


    private static class Bucket {
        int[] balde;
        int topo;

        public Bucket(int tamanho) {
            balde = new int[tamanho];
            topo = 0;
        }
    }


    public BucketSort(int[] vetor) {
        this.vetor = vetor.clone();
        this.quantidadeElementos = this.vetor.length;


        int numBucket = 100;


        ordenar(numBucket);


        this.ordenadoSucesso = verificarOrdenacao();
    }

    private void ordenar(int numBucket) {
        long inicio = System.nanoTime();

        executarBucketSort(this.vetor, this.vetor.length, numBucket);

        long fim = System.nanoTime();
        this.tempoExecucaoMs = (fim - inicio) / 1_000_000.0;
    }

    private void executarBucketSort(int[] v, int tam, int numBucket) {
        if (tam <= 0) return;


        int maiorValor = v[0];
        for (int i = 1; i < tam; i++) {
            if (v[i] > maiorValor) {
                maiorValor = v[i];
            }
        }

        Bucket[] b = new Bucket[numBucket];


        for (int i = 0; i < numBucket; i++) {
            b[i] = new Bucket(tam);
        }


        for (int i = 0; i < tam; i++) {

            int indiceBalde = (int) (((long) v[i] * (numBucket - 1)) / (maiorValor == 0 ? 1 : maiorValor));

            b[indiceBalde].balde[b[indiceBalde].topo] = v[i];
            b[indiceBalde].topo++;
        }


        for (int i = 0; i < numBucket; i++) {
            if (b[i].topo > 0) {
                bubbleSort(b[i].balde, b[i].topo);
            }
        }


        int idx = 0;
        for (int j = 0; j < numBucket; j++) {
            for (int k = 0; k < b[j].topo; k++) {
                v[idx] = b[j].balde[k];
                idx++;
            }
        }
    }

    private void bubbleSort(int[] v, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
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

    // Getters para métricas e relatórios
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


    public void exibirRelatorio(String nomeArquivo) {
        System.out.println("   RELATÓRIO DE EXECUÇÃO: BUCKET SORT");
        System.out.println("========================================");
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Quantidade de dados ordenados: " + quantidadeElementos);
        System.out.println("Status da ordenação: " + (ordenadoSucesso ? "CORRETO (Ordenado)" : "ERRO (Não ordenado)"));
        System.out.println("Tempo de execução: " + String.format("%.4f", tempoExecucaoMs) + " ms");
        System.out.println("\n");
    }
}