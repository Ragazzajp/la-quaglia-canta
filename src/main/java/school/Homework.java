package school;

public class Homework {

    boolean isOnGitHub;
    String difficulty;
    int score;

    Homework(String difficulty) {
        this.difficulty = difficulty;
    }

    void pushToGitHub() {
        // here we push to github
        this.isOnGitHub = true;
    }
}
