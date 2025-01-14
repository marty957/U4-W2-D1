package esercizio3;

public class Main {
    public static void main(String[] args) throws BancaException {
        ContoCorrente cc= new ContoCorrente("gianni",12);
        cc.preleva(10.02);
        System.out.println(cc.restituiscisaldo());
        cc.preleva(25);

    }

}
