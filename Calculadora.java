
package calculadoraimpostos;

public class Calculadora {
    
    public double calcular(String imposto, double valor){
        if(imposto.equals("ICMS")) {
            return valor * 0.1;
        }else if(imposto.equals("IPI")) {
            return valor * 0.2;
        }else if(imposto.equals("OUTRO_IMPOSTO")){
            return valor * 0.5;
        }
        return valor;
    }
    
}
