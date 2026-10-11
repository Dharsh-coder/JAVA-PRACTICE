package treeSet;

import java.util.Scanner;
import java.util.TreeSet;

// We want to read numbers and print unique elements in ascending order.
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            set.add(x);
        }
        int y = set.first();
        set.remove(y);
        int smin = set.first();
        System.out.println(smin);
        sc.close();
    }
}
