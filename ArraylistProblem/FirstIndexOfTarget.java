package ArraylistProblem;
// Read n integers and a target x. Print the index of the first occurrence of x. If it doesn't exist, print -1.
import java.util.ArrayList;
import java.util.Scanner;

public class FirstIndexOfTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int x = sc.nextInt();
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        sc.close();
    }
}
// input
// 5
// 10 20 30 20 40
// 20

// output
// 1