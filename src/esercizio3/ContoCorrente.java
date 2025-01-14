package esercizio3;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    private final int maxMovimenti=50;
    protected double saldo;

    public ContoCorrente (String titolare, double saldo){
        this.titolare=titolare;
        this.saldo=saldo;
        this.nMovimenti=0;
    }
    public void preleva(double x) throws BancaException {

        if(nMovimenti< maxMovimenti){
            saldo=saldo-x;
            if (saldo<0){
                nMovimenti++;
                throw new BancaException("il conto è in rosso");

        }

        } else {
            saldo=saldo-x-0.50;

        }
    }
    public double restituiscisaldo(){
        return  saldo;
    }


}
