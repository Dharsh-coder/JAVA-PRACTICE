package HashSet;
// Read n integers and a target x. Print YES if the target exists; otherwise, print NO.
import java.util.HashSet;
import java.util.Scanner;

public class ElementExist {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int x = sc.nextInt();

        if (set.contains(x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
// input:
// 5
// 10 20 30 40 50
// 30
// output:
// YES
