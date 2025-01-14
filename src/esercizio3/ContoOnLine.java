package esercizio3;

public class ContoOnLine extends ContoCorrente{
    private double maxPrielievo;
    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrielievo=maxP;

    }

    public void stampaSaldo(){
        System.out.println("titolare: " + titolare+"-Saldo: "+ saldo+ "-Num movimenti: " + nMovimenti+ " max mov: "+maxPrielievo+"massimo prelievo disp: " + maxPrielievo);
    }

    public void preleva(double x ) throws BancaException {
        if ((x >= maxPrielievo)) {

            super.preleva(x);
        }
    }
}
