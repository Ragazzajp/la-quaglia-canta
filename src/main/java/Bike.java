import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bike implements Comparable<Bike> {

    private String model;
    private int price;
    private String color;
    private int wheelSize;

    public Bike(String model, int price, String color, int wheelSize) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public void show() {
        System.out.println("model: " + model + " price: " + price + " color: " + color + " wheels: " + wheelSize);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int compareTo(Bike bike) {
        return this.color.compareTo(bike.color);
    }

    public static void main (String[] args) {

        List<Bike> bikes = new ArrayList<>();

        bikes.add(new Bike("Unknown",100,"blue",20));
        bikes.add(new Bike("Bianchi",800,"yellow",28));
        bikes.add(new Bike("Giant",650,"yellow",28));
        bikes.add(new Bike("Decathlon",1200,"green",26));

        Collections.sort(bikes);

        for(Bike b : bikes)
        {
            b.show();
        }
    }
}
