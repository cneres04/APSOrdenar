import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDados {

    public int[] lerArquivo(String nomeArquivo, int tamanho) throws IOException {
        int[] vetor = new int[tamanho];

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            for (int i = 0; i < tamanho; i++) {
                String linha = br.readLine();
                if (linha != null) {
                    vetor[i] = Integer.parseInt(linha.trim());
                }
            }
        }

        return vetor;
    }

    public void imprimirVetorOg(int[] vetor, String nomeDoVetor) {
        System.out.println("--- Exibindo dados ORIGINAIS de: " + nomeDoVetor + " ---");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição [" + i + "]: " + vetor[i]);
        }
        System.out.println();
    }
}