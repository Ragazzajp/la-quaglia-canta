package bank;

public class Bank {
    public static void main(String[] args) {
        Movement m1= new Movement(1234, 30.0, "Dinner", 13, 11, 2019);
        Movement m2= new Movement(1235, 10.0, "Cafe", 14, 11, 2019);
        Movement m3= new Movement(1236, 2100.0, "Salary", 27, 11, 2019);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        Account a= new Account(5432);
        a.addInMovement(m3);
        a.addOutMovement(m2);
        a.addOutMovement(m1);
        System.out.println(a);
    }
}

