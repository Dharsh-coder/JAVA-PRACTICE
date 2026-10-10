package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

// Given n integers, count how many times each distinct number occurs.
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        System.out.println(map);
        sc.close();
    }
}

// input:
// 6
// 10 20 10 30 20 10

// output:
// {10=3, 20=2, 30=1}
