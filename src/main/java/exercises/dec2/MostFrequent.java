package exercises.dec2;

import java.util.HashMap;
import java.util.Map;

class MostFrequent {

    public static int mostFrequent(int arr[]) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for (int key : arr) {
            if (counts.containsKey(key)) {
                int freq = counts.get(key);
                freq++;
                counts.put(key, freq);
            } else {
                counts.put(key, 1);
            }
        }

        // find max frequency.
        int maxCount = 0, res = -1;

        for (Map.Entry<Integer, Integer> val : counts.entrySet()) {
            if (maxCount < val.getValue()) {
                res = val.getKey();
                maxCount = val.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 1, 4, 1};
        System.out.println(mostFrequent(arr));
    }
}