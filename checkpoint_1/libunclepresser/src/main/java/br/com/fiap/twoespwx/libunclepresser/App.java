/* 
 * Grupo: LORENZO 
 * Autores: 
 *      - Lorenzo Ferreira    -   RM97318
 */

package br.com.fiap.twoespwx.libunclepresser;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso correto: java -jar <caminho/para/arquivo.jar> <caminho/para/entrada.txt> <caminho/para/saida.txt>");
            return;
        }

        String caminhoEntrada = args[0];
        String caminhoSaida = args[1];

        try {
            String dadosEntrada = LeitorArquivo.lerArquivo(caminhoEntrada);
            String dadosComprimidos = CompressorRLE.comprimir(dadosEntrada);
            LeitorArquivo.escreverArquivo(caminhoSaida, dadosComprimidos);

            double[] frequencias = FrequenciaNucleotideos.calcularFrequencias(dadosEntrada);
            int tamanhoEntrada = dadosEntrada.length();
            int tamanhoSaida = dadosComprimidos.length();

            InterfaceTextual.exibirInterface(caminhoEntrada, caminhoSaida, tamanhoEntrada, tamanhoSaida, frequencias);

        } catch (IOException e) {
            System.out.println("Erro ao ler ou escrever arquivos: " + e.getMessage());
        }
    }
}
