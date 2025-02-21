
//Scrivi un programma Java che stampi tutti i numeri pari compresi tra 1 e 50 e ne riporti la somma 
//EXTRA:  Far si che si possa scegliere l'intervallo di numeri stampati e stoppare prima o dopo. 

import java.util.Scanner;

public class Test_sommaNumeriPari {

    public static void main(String[] args) {
        // Apertura scanner
        Scanner input = new Scanner(System.in);

        // Input inizio dell'intervallo
        int inizio = 0;
        System.out.println("Il numero di inizio deve essere compreso tra 1 e 50");
        System.out.println("IL numero di fine deve essere compreso tra il numero di inizio e 50");
        while (true) {
            System.out.print("Inserisci il numero di inizio: ");
            inizio = input.nextInt();
            if (inizio < 0 || inizio > 50) {
                continue;
            } else {
                break;
            }
        }

        // Input fine dell'intervallo
        int fine = 0;

        while (true) {
            System.out.print("Inserisci il numero di fine: ");
            fine = input.nextInt();
            if (fine < inizio || fine > 50) {
                continue;
            } else {
                break;
            }
        }

        int somma = 0;
        System.out.println("Numeri pari nell'intervallo:");

        // Ciclo per l'analisi dell'intervallo di numeri inserito
        for (int i = inizio; i <= fine; i++) {
            if (i % 2 == 0) {
                somma += i;
            }
        }

        System.out.println("Somma dei numeri pari nell intervallo " + inizio + " - " + fine + " = " + somma);

        // Chiusura scanner
        input.close();
    }
}