package exercises.hackerrank;

import java.util.*;

public class ReadInt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Inserisci il primo numero:\n");
        num1 = scan.nextInt();

        System.out.print("Inserisci il secondo numero\n");
        num2 = scan.nextInt();

        System.out.print("Inserisci il terzo numero\n");
        num3 = scan.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
