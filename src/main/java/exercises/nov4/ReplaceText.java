package exercises.nov4;

import java.io.*;

public class ReplaceText {
    public static void main(String[] args) throws IOException {

        // Aprire file di input
        File file = new File("input/big.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // Aprire file di output
        Writer writer = new FileWriter("target/Adventures of Marfisa.txt");

        // leggere ogni riga di input
        String text;
        while ((text = reader.readLine()) != null) {

            String replaced = text
                    .replace("Sherlock", "Marfisa")
                    .replace("SHERLOCK", "MARFISA");

            // scriverla sull'output
            writer.write(replaced);
            writer.write('\n');
        }

        // chiudere file di input
        reader.close();

        // chiudere file di output
        writer.close();
    }
}