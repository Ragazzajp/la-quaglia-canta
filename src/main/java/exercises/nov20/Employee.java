package exercises.nov20;

import java.util.ArrayList;

public class Employee {
    private String id;
    private String name;
    private Integer salary;
    private String location;
    private ArrayList<Integer> qualifications_ids;

    Employee(String id, String name, Integer salary, String location, ArrayList<Integer> qualifications_ids) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.qualifications_ids = qualifications_ids;

    }

    public String toString() {
        return "id=" + id +
                "name=" + name +
                ", salary=" + salary + '€' +
                ", location='" + location + '\'' +
                ", qualifications_ids=" + qualifications_ids;
    }
}
