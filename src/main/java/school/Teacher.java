package school;

public class Teacher {
    String name;
    int age;
    String gender;
    String course;

    void introduce() {
        System.out.println("Hello my name is " + name + ". I am teaching: " + course);
    }

    void check(Homework homework) {
        homework.score = 80;
    }
}
