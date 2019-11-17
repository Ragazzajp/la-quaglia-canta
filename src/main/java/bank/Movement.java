package bank;

public class Movement {

    private int id;
    private double amount;
    private String category;
    private int day;
    private int month;
    private int year;

    Movement(int id, double amount, String category, int day, int month, int year) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", amount=" + amount + '€' +
                ", category='" + category + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
