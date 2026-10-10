package Hashmap;
// Given n integers, print the number with the highest frequency. 
// If multiple numbers have the same highest frequency, print the smallest number.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        int maxFreq = 0;
        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq ||
                (freq == maxFreq && num < answer)) {
                maxFreq = freq;
                answer = num;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}

// input:
// 7
// 10 20 10 30 20 10 20
// output:
// 10
