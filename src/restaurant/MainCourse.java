package restaurant;

public class MainCourse {
    int numberInTheMenu;
    String name;
    String cookMethod;
    String type;
    int price;


    MainCourse(int numberInTheMenu, String name, String cookMethod, String type,int price) {
        this.numberInTheMenu = numberInTheMenu;
        this.name = name;
        this.cookMethod = cookMethod;
        this.type = type;
        this.price = price;
    }
    void introduce() {

        System.out.println(this.numberInTheMenu + this.name + this.cookMethod + this.type + this.price + "€");
    }
}
