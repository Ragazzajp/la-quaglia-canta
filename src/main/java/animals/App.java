package animals;

public class App {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.hasWarmBlood = true;
        t.limbs = 4;
        t.weight = 100;

        t.roar();
        t.breath();
        t.giveMilk();

        Snake s = new Snake();
        s.hasCoolBlood = true;
        s.isVenomous = true;
        s.length = 20;
        s.breath();
        s.slither();
    }
}
