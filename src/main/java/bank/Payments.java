package bank;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.*;

public class Payments {

    private static String csvName = "input/payments.csv";

    public static void main(String[] args) throws IOException {

        Account a = new Account(0);

        Reader in = new FileReader(csvName);
        Iterable<CSVRecord> records = CSVFormat.RFC4180
                    .withHeader("id", "amount", "category", "day", "month", "year")
                    .withIgnoreSurroundingSpaces()
                    .withSkipHeaderRecord()
                    .parse(in);

        for (CSVRecord record : records) {

            int id = Integer.parseInt(record.get("id"));
            double amount = Double.parseDouble(record.get("amount"));
            String category = record.get("category");

            // date

            int day = Integer.parseInt(record.get("day"));
            int month = Integer.parseInt(record.get("month"));
            int year = Integer.parseInt(record.get("year"));

            if (amount < 0) {
                Movement m = new Movement(id, -amount, category, day, month, year);
                a.addOutMovement(m);
                System.out.println(m);
            }
            else {
                Movement m = new Movement(id, amount, category, day, month, year);
                a.addInMovement(m);
                System.out.println(m);
            }
        }

        System.out.println(a);
    }
}