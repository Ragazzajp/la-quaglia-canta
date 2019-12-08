package school;

public class School {
    public static void main(String[] args) {
        Teacher teacherAlina = new Teacher();
        teacherAlina.name = "Alina D.";
        teacherAlina.age = 30;
        teacherAlina.gender = "female";
        teacherAlina.course = "Java 2";
        teacherAlina.introduce();

        Student studentHarry = new Student("Harry Potter");
        Student badStudent = new Student("Voland");
        studentHarry.introduce();
        badStudent.introduce();
        studentHarry.helpAnotherStudent(badStudent);

        Lesson oopLesson1 = new Lesson("OOP Introduction");
        oopLesson1.printInfo();

        Student[] students = new Student[]{studentHarry, badStudent}; //questo è un Array posso cambiare cosa metto dentro (cambiando quello che c'è nella posizione iniziale ma non la sua grandezza
        Lesson oopLesson2 = new Lesson("OOP Object & Classes", teacherAlina, students);
        oopLesson2.printInfo();

        Homework harryHomeWork = studentHarry.doMyHomework();
        teacherAlina.check(harryHomeWork);
        System.out.println(harryHomeWork.score); //prints 80

        for (Student s : oopLesson2.students) {
            System.out.println(s.name);
        }
    }
}