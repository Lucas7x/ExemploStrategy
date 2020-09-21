
package calculadoraimpostos;

public class CalculadoraStrategy {
    
    public double calcularImposto(Imposto imposto, double valor){
        return imposto.calcular(valor);
    }
    
}
