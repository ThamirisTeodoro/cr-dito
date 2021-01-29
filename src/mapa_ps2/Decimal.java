package mapa_ps2;

import java.text.NumberFormat;
import java.util.Locale;


public class Decimal {
    
    double formatado;
    String valor;
    
    void numeral (){
    
    Locale locBr = new Locale("pt");
    NumberFormat p = NumberFormat.getInstance(locBr);
    String resultado = p.format(formatado);
    valor = resultado;
    
    }
    
    
    
}
