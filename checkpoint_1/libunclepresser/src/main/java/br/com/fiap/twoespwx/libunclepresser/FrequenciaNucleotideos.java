
package br.com.fiap.twoespwx.libunclepresser;

public class FrequenciaNucleotideos {

    public static double[] calcularFrequencias(String dados) {
        double[] frequencias = new double[4]; // A, C, T, G
        int tamanho = dados.length();

        for (char nucleotideo : dados.toCharArray()) {
            switch (nucleotideo) {
                case 'A':
                    frequencias[0]++;
                    break;
                case 'C':
                    frequencias[1]++;
                    break;
                case 'T':
                    frequencias[2]++;
                    break;
                case 'G':
                    frequencias[3]++;
                    break;
            }
        }

        for (int i = 0; i < 4; i++) {
            frequencias[i] = (frequencias[i] / tamanho) * 100;
        }
        return frequencias;
    }
}
