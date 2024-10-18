
package br.com.fiap.twoespwx.libunclepresser;

import java.io.*;

public class LeitorArquivo {

    public static String lerArquivo(String caminho) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        BufferedReader leitor = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            conteudo.append(linha);
        }
        leitor.close();
        return conteudo.toString();
    }

    public static void escreverArquivo(String caminho, String dados) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho));
        escritor.write(dados);
        escritor.close();
    }
}
