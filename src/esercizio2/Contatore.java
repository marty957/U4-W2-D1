package esercizio2;

import java.util.Scanner;

import esercizio1.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Contatore {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Main.class);
    public static void main(String[] args)  {

        Scanner sc= new Scanner(System.in);
        Contatore auto=new Contatore();
        System.out.println("Digita il numero di km percorsi: ");
         int km=Integer.parseInt(sc.nextLine());
        System.out.println("Hai percorso: " + km);
        System.out.println("inserisci i litri di carburante consumati: ");
         int litri=Integer.parseInt(sc.nextLine());

             try {
                 Contatore.consumi(km, litri);
             }catch (Exception e){
                logger.error("I litri consumati non possono essere zero");


         }



}
    private static void consumi(int km, int litri){
        double kmLitri= km/litri;
        System.out.println("hai percoso: " + km+ " e consumato: " + litri + " il consumo del tuo mezzo è di: " + kmLitri+"km/l"  );
    }




}
