//Read n integers into an ArrayList. Read another integer x and append it to the list. 
// If the list contains at least two elements, remove the element at index 1. Print the final list and its size.
package ArraylistProblem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int x = sc.nextInt();
        list.add(x);

        if (list.size() >= 2) {
            list.remove(1);
        }

        System.out.println(list);
        System.out.println(list.size());
        sc.close();
    }
}

// input:
// 4
// 10 20 30 40
// 50

// output:
// [10, 30, 40, 50]
// 4