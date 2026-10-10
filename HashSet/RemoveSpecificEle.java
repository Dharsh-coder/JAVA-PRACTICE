package HashSet;

import java.util.HashSet;
import java.util.Scanner;

// Read n integers into a HashSet. Read a target x, remove it if present, and print the final size.
public class RemoveSpecificEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int x = sc.nextInt();
        set.remove(x);

        System.out.println(set.size());
        sc.close();
    }
}

// input:
// 5
// 10 20 30 20 40
// 20
// output:
// 3