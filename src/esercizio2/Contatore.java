package esercizio2;

import java.util.Scanner;

public class Contatore {


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
                 System.out.println("I litri consumati non possono essere zero");


         }



}
    private static void consumi(int km, int litri){
        double kmLitri= km/litri;
        System.out.println("hai percoso: " + km+ " e consumato: " + litri + " il consumo del tuo mezzo è di: " + kmLitri+"km/l"  );
    }




}
