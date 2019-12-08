package exercises.nov20;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("input/employees.json");
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader(file));
        EmployeeList employeeList = gson.fromJson(br, EmployeeList.class);

        for (Employee employee : employeeList.employees) {

            System.out.println(employee);
        }
    }
}