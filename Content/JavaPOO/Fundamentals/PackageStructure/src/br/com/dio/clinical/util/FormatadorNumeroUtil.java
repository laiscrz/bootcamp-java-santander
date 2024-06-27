package br.com.dio.clinical.util;

import java.text.DecimalFormat;

public class FormatadorNumeroUtil {

    public static String formatarNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(numero);
    }
}
