package exercises.hackerrank;

import java.util.*;

public class SockMerchant {

    static int sockMerchant(List<Integer> list) {

        Set<Integer> set = new HashSet<Integer>();
        int pairCount = 0;
        for (int element : list) {
            if (set.contains(element)) {
                set.remove(element);
                pairCount++;
            } else {
                set.add(element);
            }
        }
        return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // To do: finish by reading integers from the scanner
    }
}
