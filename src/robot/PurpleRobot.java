package robot;

public class PurpleRobot extends BlueRobot {
        PurpleRobot(String name, String eyesColor, int weight) {
            super(name, eyesColor, weight);
            this.changeColor("Purple");
        }

        public int pow(int a) {
            return super.multiply(a,a);
        }

        public void introduce() {
            System.out.println("Hey, I am a " + this.name + "I know how to multiply integers.");
            super.introduce();
        }
    }