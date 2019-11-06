import java.io.*;

public class ReadUser {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Writer writer = new FileWriter("Gatto.txt");
        writer.write(text);
        writer.close();
    }
}

