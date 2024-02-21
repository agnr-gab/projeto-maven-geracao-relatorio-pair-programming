package br.com.softplan.report.application;

import java.util.List;

public class GeradorObservacao {

    static final String MSG_UMA_NOTA = "Fatura da nota fiscal de simples remessa: ";

    static final String MSG_MULTIPLAS_NOTAS = "Fatura das notas fiscais de simples remessa: ";

    public String geraObservacao(List<?> numerosNotaFiscal) {

        if (numerosNotaFiscal == null || numerosNotaFiscal.isEmpty()) {

            return "";
        }
        String observacao = "";

        if (numerosNotaFiscal.size() == 1) {
            observacao = MSG_UMA_NOTA + numerosNotaFiscal.get(0);

        } else {
            observacao = MSG_MULTIPLAS_NOTAS;

            for (int i = 0; i < numerosNotaFiscal.size(); i++) {
                observacao += numerosNotaFiscal.get(i);

                if (i < numerosNotaFiscal.size() - 2) {
                    observacao += ", ";
                } else if (i == numerosNotaFiscal.size() - 2) {
                    observacao += " e ";
                }


            }

        }
        return observacao + ".";
    }
}