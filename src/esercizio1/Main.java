package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Main.class);
    public static void main(String[] args)  {
        Esercizio1 es1 = new Esercizio1();
        Scanner sc = new Scanner(System.in);
        System.out.println("questa è la lista fornita:");

        es1.show();
        int posizione;
        int numero;
       while(true) {

            System.out.println("Se vuoi cambiare un numero digita la posizione, deve essere un numero tra 1 e 5.Digita 0 per terminare il programma:");
            posizione = Integer.parseInt(sc.nextLine());

            if(posizione==0){
                logger.info("programma terminato con successo");
                break;
            } else if (posizione>5) {
                try{
                   throw new Exception("numero inserito non valido");
                } catch (Exception e){
                    logger.error("posizone non valida");
                    break;
                }


            }
           System.out.println(("hai selezionato la posizione: "+ posizione ));
            System.out.println(("Ora digita il numero nuovo da inserire nella posizione selezionata. DEVE essere un numero compreso tra 1 e 10.Digita 0 per terminare il programma"));

             numero=Integer.parseInt(sc.nextLine());
             if(numero==0){
                 logger.info("programma terminato con successo");
                 break;
             } else if (numero>10) {
                 try {
                     throw new Exception("numero inserito non valido" );
                 } catch (Exception e) {
                     logger.error("numero inserito non valido");
                     break;
                 }

             }
           es1.lista[posizione-1]=numero;
            es1.show();
       }

    }
}