
package calculadoraimpostos;

public class ICMS implements Imposto{
    
    private final double TAXA = 0.1;
    
    @Override
    public double calcular(double valor){
        return valor * TAXA;
    }
    
}
