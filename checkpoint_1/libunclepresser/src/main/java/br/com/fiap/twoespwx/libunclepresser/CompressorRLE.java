
package br.com.fiap.twoespwx.libunclepresser;

public class CompressorRLE {

    public static String comprimir(String dados) {
        StringBuilder resultado = new StringBuilder();
        int contador = 1;

        for (int i = 1; i < dados.length(); i++) {
            if (dados.charAt(i) == dados.charAt(i - 1)) {
                contador++;
            } else {
                resultado.append(dados.charAt(i - 1)).append(contador);
                contador = 1;
            }
        }
        resultado.append(dados.charAt(dados.length() - 1)).append(contador);
        return resultado.toString();
    }
}
