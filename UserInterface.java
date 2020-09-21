package calculadoraimpostos;

public class UserInterface {

    public static void main(String[] args) {
        
        CalculadoraStrategy calcs = new CalculadoraStrategy();
        
        
        Imposto icms = new ICMS();
        Imposto ipi = new IPI();
        
        double ipiValue = calcs.calcularImposto(ipi, 100);
        double icmsValue = calcs.calcularImposto(icms, 100);
        
        System.out.println("ICMS: " + ipiValue);
        System.out.println("IPI: " + icmsValue);
        
    }
    
}
