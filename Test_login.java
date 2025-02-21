import java.util.Scanner;

public class Test_login {
    public static void main(String[] args) {
        // Creazione dello scanner per l'input utente
        Scanner scanner = new Scanner(System.in);

        // Dichiarazione delle variabili per memorizzare i dati dell'utente
        String nome = "", password = "", rispostaSegreta = "";

        // Variabile per verificare se l'utente è registrato
        boolean registrato = false;

        // Loop principale per il menu
        while (true) {
            // Menu delle opzioni
            System.out.println("1. Registrati");
            System.out.println("2. Login");
            System.out.println("3. Modifica dati");
            System.out.println("-1. Esci");
            System.out.print("Scelta: ");

            // Lettura della scelta dell'utente
            int scelta = scanner.nextInt();
            scanner.nextLine();

            // Opzione per uscire
            if (scelta == -1) {
                System.out.println("Uscita dal sistema.");
                scanner.close();
                break;
            }
            // Opzione per la registrazione
            else if (scelta == 1) {
                if (registrato) {
                    System.out.println("Utente già registrato!");
                } else {
                    System.out.print("Inserisci nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Inserisci password: ");
                    password = scanner.nextLine();
                    System.out.print("Inserisci risposta alla domanda segreta (colore preferito?): ");
                    rispostaSegreta = scanner.nextLine();
                    registrato = true;
                    System.out.println("Registrazione completata!");
                }
            }
            // Opzione per il login
            else if (scelta == 2) {
                if (!registrato) {
                    System.out.println("Nessun utente registrato!");
                } else {
                    System.out.print("Inserisci nome: ");
                    String nomeLogin = scanner.nextLine();
                    System.out.print("Inserisci password: ");
                    String passLogin = scanner.nextLine();

                    // Verifica delle credenziali
                    if (nomeLogin.equals(nome) && passLogin.equals(password)) {
                        System.out.println("Login effettuato!");
                    } else {
                        System.out.println("Credenziali errate!");
                    }
                }
            }
            // Opzione per modificare i dati dell'utente
            else if (scelta == 3) {
                if (!registrato) {
                    System.out.println("Nessun utente registrato!");
                } else {
                    System.out.print("Rispondi alla domanda segreta (colore preferito?): ");
                    String risposta = scanner.nextLine();

                    // Verifica della risposta segreta
                    if (risposta.equals(rispostaSegreta)) {
                        System.out.print("Inserisci nuova password: ");
                        password = scanner.nextLine();
                        System.out.print("Inserisci nuova risposta alla domanda segreta: ");
                        rispostaSegreta = scanner.nextLine();
                        System.out.println("Dati modificati con successo!");
                    } else {
                        System.out.println("Risposta errata!");
                    }
                }
            }
            // Gestione di scelte non valide
            else {
                System.out.println("Scelta non valida!");
            }
        }
    }
}