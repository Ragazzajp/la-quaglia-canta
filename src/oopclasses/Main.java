package oopclasses;

public class Main {
    public static void main(String[] args) {
        Teacher teacherAlina = new Teacher();
        teacherAlina.name = "Alina Denisenko";
        teacherAlina.age = 30;
        teacherAlina.gender = true;
        teacherAlina.course = "Java 2";
        teacherAlina.introduce();

        Student studentHarry = new Student("Harry Potter");
        Student badStudent = new Student("Voland");
        studentHarry.introduce();
        badStudent.introduce();
        studentHarry.helpAnotherStudent (badStudent);

        Lesson oopLesson1 = new Lesson("OOP Introduction");
        Lesson oopLesson2 = new Lesson("OOP Object & Classes", teacherAlina, 2);

        oopLesson2.printInfo();

        Homework harryPotter = studentHarry.doMyHomework();
    }
}

class Teacher {
    String name;
    int age;
    boolean gender;
    String course;
    void introduce() {
        System.out.println("Hello my name is " + name + ". I am teaching: " + course);
    }
}

class Student {
    String name;
    int averageScore;
    boolean alwaysAttendClasses;
    Student(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println( "Hey! My name is: " + this.name);
    }

    void helpAnotherStudent (Student student){
        System.out.println(this.name + " helps " + student.name);
    }
    Homework doMyHomework(){
        Homework homework = new Homework("Easy");
        //do some coding
        homework.pushToGitHub();
        return homework; //dobbiamo sempre specificare cosa ritorniamo
    }
}

class Lesson {
    String topic;
    boolean inEnglish;
    Teacher teacher;
    Student[] students;

    Lesson(String topic, Teacher teacher, int numbersOfStudents) {//constractor da qui
        this.topic = topic;
        this.inEnglish = true;
        this.teacher = teacher;
        this.students = new Student[numbersOfStudents];//fino a qui
    }

    Lesson(String topic) {
        this.topic = topic;
    }

    void printInfo() {
        if (inEnglish) {
            System.out.println("This is lesson: " + topic);
        } else {
            System.out.println("Non capisco!");
        }
    }
}

class Homework {
    boolean isOnGitHub;
    String difficulty;
    int score;
    Homework(String difficulty){
        this.difficulty = difficulty;
    }
    void pushToGitHub(){
        // here we push to github
        this.isOnGitHub = true;
    }
}
