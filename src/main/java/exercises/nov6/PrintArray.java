package exercises.nov6;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrintArray {
    public static void main(String[] args)throws Exception {

        Gson gson= new Gson();

        File file = new File ("input/countries.json");

        BufferedReader br = new BufferedReader(new FileReader(file));

        Country[] countries = gson.fromJson(br, Country[].class);

        // System.out.println(countries[3].getName());

        for (Country country: countries) {
            System.out.println(country.getName());
        }
    }
}
