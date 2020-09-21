package calculadoraimpostos;

public class IPI implements Imposto{

    private final double TAXA = 0.2;
    
    @Override
    public double calcular(double valor){
        return valor * TAXA;
    }
    
}
