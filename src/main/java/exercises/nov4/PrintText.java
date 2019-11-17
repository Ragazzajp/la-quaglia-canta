package exercises.nov4;

import java.io.*;

public class PrintText {
    public static void main(String[] args)throws Exception {

        File file = new File("C:\\Users\\MD\\Desktop\\la-quaglia-canta\\src\\exercises\\nov4\\text.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}