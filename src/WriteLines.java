import java.io.*;

public class WriteLines {
    // Costruttore della classe che prende il nome del file come parametro
    public WriteLines(String filename) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter(filename)); // Inizializza il PrintWriter per scrivere nel file
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // Inizializza il BufferedReader per leggere dall'input standard

        String linea = input.readLine(); // Legge la prima linea di input
        // Continua a leggere finché l'utente non inserisce una linea vuota
        while (!linea.equals("")) {
            output.println(linea); // Scrive la linea nel file
            linea = input.readLine(); // Legge la successiva linea di input
        }

        input.close(); // Chiude il BufferedReader
        output.close(); // Chiude il PrintWriter
    }

    // Metodo main per avviare l'applicazione
    public static void main(String[] args) {
        try {
            // Crea un'istanza di WriteLines utilizzando il primo argomento della riga di comando come nome del file
            WriteLines cp = new WriteLines(args[0]);
        } catch (IOException ex) {
            // Gestisce eventuali eccezioni di I/O
            System.out.println("Errore di I/O.");
            System.exit(1);
        }
    }
}
