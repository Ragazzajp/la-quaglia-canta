package exercises.nov6;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrintSingle {
    public static void main(String[] args)throws Exception {

        Gson gson= new Gson();

        File file = new File ("C:\\Users\\MD\\Desktop\\la-quaglia-canta\\src\\exercises\\nov6\\country.json");

        BufferedReader br = new BufferedReader(new FileReader(file));

        Country country = gson.fromJson(br, Country.class);

        System.out.println(country.getName());
    }
}
