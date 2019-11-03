package robot;

public class MainRobot {
    public static void main(String[] args) {
/*      robot.Robot robotBot = new robot.Robot("Bot", "blue", "black", 8 );
        robot.Robot robotRob = new robot.Robot("Rob", "yellow", "green", 10 );
        robot.Robot tedRobot = new robot.Robot("Renato", "brown");
        robot.Robot renatoRobot = new robot.Robot();
        robot.Robot robotBlue = new robot.Robot("Blue");
        robot.Robot robotYellow = new robot.Robot("Yellow", "Green");

        // all our robots, how many are yellow?
        // write a loop to introduce only the yellow ones

        robot.Robot[] robots = new robot.Robot[]{robotBlue, robotBot, robotRob, tedRobot, renatoRobot, robotYellow};
        for (robot.Robot r : robots)
            if ("yellow".equalsIgnoreCase(r.color)){
                r.introduce();
        }*/
        YellowRobot newYellowRobot = new YellowRobot("Yellow robot.Robot!", "Green", 70);
        newYellowRobot.introduce();
        int sum = newYellowRobot.sum(3, 4);
        System.out.println(sum);

        BlueRobot newBlueRobot = new BlueRobot("Blue robot.Robot!", "Green", 70);
        newBlueRobot.introduce();
        int multiply = newBlueRobot.multiply(3, 4);
        System.out.println(multiply);

        PurpleRobot newPurpleRobot = new PurpleRobot("Purple robot.Robot!", "Green", 70);
        newPurpleRobot.introduce();
        System.out.println(newPurpleRobot.pow(3));
    }
}
