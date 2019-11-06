import java.io.*;

public class Ex4Nov {
    public static void main(String[] args)throws Exception {

        File file = new File("C:\\Users\\MD\\Desktop\\la-quaglia-canta\\src\\Ex4Nov.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}