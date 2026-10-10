package HashSet;

import java.util.HashSet;
import java.util.Scanner;

// Read n integers and print every distinct element. The order doesn't matter
public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

// input:6
// 10 20 10 30 20 40
// output:
// 20 40 10 30