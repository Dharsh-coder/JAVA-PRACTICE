package HashSet;
// Read n integers, store them in a HashSet, and print the number of distinct elements.
import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println(set.size());
        sc.close();
    }
}

// input:
// 7
// 10 20 10 30 20 40 50
// output:
// 5