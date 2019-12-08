package school;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hey! My name is: " + this.name);
    }

    void helpAnotherStudent(Student student) {
        System.out.println(this.name + " helps " + student.name);
    }

    Homework doMyHomework() {
        Homework homework = new Homework("Easy");
        //do some coding
        homework.pushToGitHub();
        return homework; //dobbiamo sempre specificare cosa ritorniamo
    }
}
