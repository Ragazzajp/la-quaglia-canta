package school;

public class Lesson {
    String topic;
    boolean inEnglish;
    Teacher teacher;
    Student[] students;

    Lesson(String topic, Teacher teacher, Student[] students) {//constructor da qui
        this.topic = topic;
        this.inEnglish = true;
        this.teacher = teacher;
        this.students = students;//fino a qui
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