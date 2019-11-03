package robot;

public class YellowRobot extends Robot{
    YellowRobot (String name, String eyesColor, int weight){
        super(name, eyesColor, weight);
        this.changeColor("Yellow");
        }
        public int sum(int a, int b){
               return a + b;
        }
}
