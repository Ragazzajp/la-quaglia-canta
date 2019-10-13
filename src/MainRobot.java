public class MainRobot {
    public static void main(String[] args) {
/*      Robot robotBot = new Robot("Bot", "blue", "black", 8 );
        Robot robotRob = new Robot("Rob", "yellow", "green", 10 );
        Robot tedRobot = new Robot("Renato", "brown");
        Robot renatoRobot = new Robot();
        Robot robotBlue = new Robot("Blue");
        Robot robotYellow = new Robot("Yellow", "Green");

        // all our robots, how many are yellow?
        // write a loop to introduce only the yellow ones

        Robot[] robots = new Robot[]{robotBlue, robotBot, robotRob, tedRobot, renatoRobot, robotYellow};
        for (Robot r : robots)
            if ("yellow".equalsIgnoreCase(r.color)){
                r.introduce();
        }*/
        YellowRobot newYellowRobot = new YellowRobot("Yellow Robot!", "Green", 70);
        newYellowRobot.introduce();
        int sum = newYellowRobot.sum(3, 4);
        System.out.println(sum);

        BlueRobot newBlueRobot = new BlueRobot("Blue Robot!", "Green", 70);
        newBlueRobot.introduce();
        int multiply = newBlueRobot.multiply(3, 4);
        System.out.println(multiply);

        PurpleRobot newPurpleRobot = new PurpleRobot("Purple Robot!", "Green", 70);
        newPurpleRobot.introduce();
        System.out.println(newPurpleRobot.pow(3));
    }
}
