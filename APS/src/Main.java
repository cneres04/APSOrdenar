import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LeitorDados leitor = new LeitorDados();

        // Base de Caminhos (Paths)
        String pathComDup1K = "C:\\Users\\\\OneDrive\\Desktop\\APS - Estrutura de dados\\APS\\dados com duplicidade\\1K\\";
        String pathComDup10K = "C:\\Users\\\\OneDrive\\Desktop\\APS - Estrutura de dados\\APS\\dados com duplicidade\\10K\\";
        String pathSemDup1K = "C:\\Users\\\\OneDrive\\Desktop\\APS - Estrutura de dados\\APS\\dados sem duplicidade\\1K\\";
        String pathSemDup10K = "C:\\Users\\\\OneDrive\\Desktop\\APS - Estrutura de dados\\APS\\dados sem duplicidade\\10K\\";


        // 1. DADOS COM DUPLICIDADE - 1K
        int[] dados1 = leitor.lerArquivo(pathComDup1K + "dtaleat1kdup0.txt", 1000);
        int[] dados2 = leitor.lerArquivo(pathComDup1K + "dtconcv1kdup0.txt", 1000);
        int[] dados3 = leitor.lerArquivo(pathComDup1K + "dtconvx1kdup0.txt", 1000);
        int[] dados4 = leitor.lerArquivo(pathComDup1K + "dtcresc1kdup0.txt", 1000);
        int[] dados5 = leitor.lerArquivo(pathComDup1K + "dtdecre1kdup0.txt", 1000);


        // 2. DADOS COM DUPLICIDADE - 10K
        int[] _10kdados1 = leitor.lerArquivo(pathComDup10K + "dtaleat10kdup0.txt", 10000);
        int[] _10kdados2 = leitor.lerArquivo(pathComDup10K + "dtconcv10kdup0.txt", 10000);
        int[] _10kdados3 = leitor.lerArquivo(pathComDup10K + "dtconvx10kdup0.txt", 10000);
        int[] _10kdados4 = leitor.lerArquivo(pathComDup10K + "dtcresc10kdup0.txt", 10000);
        int[] _10kdados5 = leitor.lerArquivo(pathComDup10K + "dtdecre10kdup0.txt", 10000);


        // 3. DADOS SEM DUPLICIDADE - 1K
        int[] sdup_1kdados1 = leitor.lerArquivo(pathSemDup1K + "dtaleat1kuni0.txt", 1000);
        int[] sdup_1kdados2 = leitor.lerArquivo(pathSemDup1K + "dtconcv1kuni0.txt", 1000);
        int[] sdup_1kdados3 = leitor.lerArquivo(pathSemDup1K + "dtconvx1kuni0.txt", 1000);
        int[] sdup_1kdados4 = leitor.lerArquivo(pathSemDup1K + "dtcresc1kuni0.txt", 1000);
        int[] sdup_1kdados5 = leitor.lerArquivo(pathSemDup1K + "dtdecre1kuni0.txt", 1000);

        // 4. DADOS SEM DUPLICIDADE - 10K
        int[] sdup_10kdados1 = leitor.lerArquivo(pathSemDup10K + "dtaleat10kuni0.txt", 10000);
        int[] sdup_10kdados2 = leitor.lerArquivo(pathSemDup10K + "dtconcv10kuni0.txt", 10000);
        int[] sdup_10kdados3 = leitor.lerArquivo(pathSemDup10K + "dtconvx10kuni0.txt", 10000);
        int[] sdup_10kdados4 = leitor.lerArquivo(pathSemDup10K + "dtcresc10kuni0.txt", 10000);
        int[] sdup_10kdados5 = leitor.lerArquivo(pathSemDup10K + "dtdecre10kuni0.txt", 10000);



        // EXECUÇÃO - 1K COM DUPLICIDADE
        new InsertionSort(dados1).exibirRelatorioInsertionSort("Aleatório - 1k com duplicidade");
        new MergeSort(dados1).exibirRelatorioMergeSort("Aleatório - 1k com duplicidade");
        new BucketSort(dados1).exibirRelatorio("Aleatório - 1k com duplicidade");

        new InsertionSort(dados2).exibirRelatorioInsertionSort("Concavo - 1k com duplicidade");
        new MergeSort(dados2).exibirRelatorioMergeSort("Concavo - 1k com duplicidade");
        new BucketSort(dados2).exibirRelatorio("Concavo - 1k com duplicidade");

        new InsertionSort(dados3).exibirRelatorioInsertionSort("Convexo - 1k com duplicidade");
        new MergeSort(dados3).exibirRelatorioMergeSort("Convexo - 1k com duplicidade");
        new BucketSort(dados3).exibirRelatorio("Convexo - 1k com duplicidade");

        new InsertionSort(dados4).exibirRelatorioInsertionSort("Crescente - 1k com duplicidade");
        new MergeSort(dados4).exibirRelatorioMergeSort("Crescente - 1k com duplicidade");
        new BucketSort(dados4).exibirRelatorio("Crescente - 1k com duplicidade");

        new InsertionSort(dados5).exibirRelatorioInsertionSort("Descrescente - 1k com duplicidade");
        new MergeSort(dados5).exibirRelatorioMergeSort("Descrescente - 1k com duplicidade");
        new BucketSort(dados5).exibirRelatorio("Descrescente - 1k com duplicidade");



        // EXECUÇÃO - 10K COM DUPLICIDADE
        new InsertionSort(_10kdados1).exibirRelatorioInsertionSort("Aleatório - 10k com duplicidade");
        new MergeSort(_10kdados1).exibirRelatorioMergeSort("Aleatório - 10k com duplicidade");
        new BucketSort(_10kdados1).exibirRelatorio("Aleatório - 10k com duplicidade");

        new InsertionSort(_10kdados2).exibirRelatorioInsertionSort("Concavo - 10k com duplicidade");
        new MergeSort(_10kdados2).exibirRelatorioMergeSort("Concavo - 10k com duplicidade");
        new BucketSort(_10kdados2).exibirRelatorio("Concavo - 10k com duplicidade");

        new InsertionSort(_10kdados3).exibirRelatorioInsertionSort("Convexo - 10k com duplicidade");
        new MergeSort(_10kdados3).exibirRelatorioMergeSort("Convexo - 10k com duplicidade");
        new BucketSort(_10kdados3).exibirRelatorio("Convexo - 10k com duplicidade");

        new InsertionSort(_10kdados4).exibirRelatorioInsertionSort("Crescente - 10k com duplicidade");
        new MergeSort(_10kdados4).exibirRelatorioMergeSort("Crescente - 10k com duplicidade");
        new BucketSort(_10kdados4).exibirRelatorio("Crescente - 10k com duplicidade");

        new InsertionSort(_10kdados5).exibirRelatorioInsertionSort("Descrescente - 10k com duplicidade");
        new MergeSort(_10kdados5).exibirRelatorioMergeSort("Descrescente - 10k com duplicidade");
        new BucketSort(_10kdados5).exibirRelatorio("Descrescente - 10k com duplicidade");


        // EXECUÇÃO - 1K SEM DUPLICIDADE
        new InsertionSort(sdup_1kdados1).exibirRelatorioInsertionSort("Aleatório - 1k sem duplicidade");
        new MergeSort(sdup_1kdados1).exibirRelatorioMergeSort("Aleatório - 1k sem duplicidade");
        new BucketSort(sdup_1kdados1).exibirRelatorio("Aleatório - 1k sem duplicidade");

        new InsertionSort(sdup_1kdados2).exibirRelatorioInsertionSort("Concavo - 1k sem duplicidade");
        new MergeSort(sdup_1kdados2).exibirRelatorioMergeSort("Concavo - 1k sem duplicidade");
        new BucketSort(sdup_1kdados2).exibirRelatorio("Concavo - 1k sem duplicidade");

        new InsertionSort(sdup_1kdados3).exibirRelatorioInsertionSort("Convexo - 1k sem duplicidade");
        new MergeSort(sdup_1kdados3).exibirRelatorioMergeSort("Convexo - 1k sem duplicidade");
        new BucketSort(sdup_1kdados3).exibirRelatorio("Convexo - 1k sem duplicidade");

        new InsertionSort(sdup_1kdados4).exibirRelatorioInsertionSort("Crescente - 1k sem duplicidade");
        new MergeSort(sdup_1kdados4).exibirRelatorioMergeSort("Crescente - 1k sem duplicidade");
        new BucketSort(sdup_1kdados4).exibirRelatorio("Crescente - 1k sem duplicidade");

        new InsertionSort(sdup_1kdados5).exibirRelatorioInsertionSort("Descrescente - 1k sem duplicidade");
        new MergeSort(sdup_1kdados5).exibirRelatorioMergeSort("Descrescente - 1k sem duplicidade");
        new BucketSort(sdup_1kdados5).exibirRelatorio("Descrescente - 1k sem duplicidade");

        // EXECUÇÃO - 10K SEM DUPLICIDADE
        new InsertionSort(sdup_10kdados1).exibirRelatorioInsertionSort("Aleatório - 10k sem duplicidade");
        new MergeSort(sdup_10kdados1).exibirRelatorioMergeSort("Aleatório - 10k sem duplicidade");
        new BucketSort(sdup_10kdados1).exibirRelatorio("Aleatório - 10k sem duplicidade");

        new InsertionSort(sdup_10kdados2).exibirRelatorioInsertionSort("Concavo - 10k sem duplicidade");
        new MergeSort(sdup_10kdados2).exibirRelatorioMergeSort("Concavo - 10k sem duplicidade");
        new BucketSort(sdup_10kdados2).exibirRelatorio("Concavo - 10k sem duplicidade");

        new InsertionSort(sdup_10kdados3).exibirRelatorioInsertionSort("Convexo - 10k sem duplicidade");
        new MergeSort(sdup_10kdados3).exibirRelatorioMergeSort("Convexo - 10k sem duplicidade");
        new BucketSort(sdup_10kdados3).exibirRelatorio("Convexo - 10k sem duplicidade");

        new InsertionSort(sdup_10kdados4).exibirRelatorioInsertionSort("Crescente - 10k sem duplicidade");
        new MergeSort(sdup_10kdados4).exibirRelatorioMergeSort("Crescente - 10k sem duplicidade");
        new BucketSort(sdup_10kdados4).exibirRelatorio("Crescente - 10k sem duplicidade");

        new InsertionSort(sdup_10kdados5).exibirRelatorioInsertionSort("Descrescente - 10k sem duplicidade");
        new MergeSort(sdup_10kdados5).exibirRelatorioMergeSort("Descrescente - 10k sem duplicidade");
        new BucketSort(sdup_10kdados5).exibirRelatorio("Descrescente - 10k sem duplicidade");
    }
}