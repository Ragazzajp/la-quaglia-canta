package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private List<Movement> inMovements;
    private List<Movement> outMovements;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.inMovements = new ArrayList<>();
        this.outMovements = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<Movement> getInMovements() {
        return inMovements;
    }

    public List<Movement> getOutMovements() {
        return outMovements;
    }

    public void addInMovement(Movement movement) {
        inMovements.add(movement);
    }

    public void addOutMovement(Movement movement) {
        outMovements.add(movement);
    }

    public double balance() {
        double balance = 0;

        for (Movement m : inMovements) {
            balance += m.getAmount();
        }
        for (Movement m : outMovements) {
            balance -= m.getAmount();
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Account number=" + accountNumber +
                ", balance=" + balance() + '€';
    }
}

