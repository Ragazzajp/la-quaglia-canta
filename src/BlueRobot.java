public class BlueRobot extends Robot {
    BlueRobot(String name, String eyesColor, int weight) {
        super(name, eyesColor, weight);
        this.changeColor("Blue");
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void introduce() {
        System.out.println("Hey, I am a " + this.name + "I know how to multiply integers.");
        super.introduce();
    }
}


