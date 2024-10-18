package br.com.fiap.twoespwx.libunclepresser;

public class InterfaceTextual {

    public static void exibirInterface(String arquivoEntrada, String arquivoSaida, int tamanhoEntrada, int tamanhoSaida, double[] frequencias) {
        System.out.println(" -----------------------------------------------------------");
        System.out.println("|           LIB UNCLE PRESSER - GRUPO LORENZO           |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.printf("| ARQUIVO DE ENTRADA: %-40s |\n", arquivoEntrada);
        System.out.printf("| ARQUIVO DE SAÍDA: %-42s |\n", arquivoSaida);
        System.out.println(" -----------------------------------------------------------");
        System.out.printf("| TAMANHO DO ARQUIVO DE ENTRADA: %-28d |\n", tamanhoEntrada);
        System.out.printf("| TAMANHO DO ARQUIVO DE SAÍDA: %-29d |\n", tamanhoSaida);
        System.out.println(" -----------------------------------------------------------");
        System.out.println("| FREQUÊNCIAS:                                              |");
        System.out.printf("| A: %.2f%%  C: %.2f%%  T: %.2f%%  G: %.2f%% |\n", frequencias[0], frequencias[1], frequencias[2], frequencias[3]);
        System.out.println(" -----------------------------------------------------------");
        System.out.printf("| TAXA DE COMPRESSÃO: =~ %.2f%%                              |\n", (1 - (double) tamanhoSaida / tamanhoEntrada) * 100);
        System.out.println(" -----------------------------------------------------------");
        System.out.println("| SCORE: WELL-DONE                                          |");
        System.out.println(" -----------------------------------------------------------");
    }
}
