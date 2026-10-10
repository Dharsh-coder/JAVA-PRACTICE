package Hashmap;
// Read n student names and marks. Then read a student's name and print their mark. 
// If the student doesn't exist, print Not found.
import java.util.HashMap;
import java.util.Scanner;

public class StoreAndRetrieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int mark = sc.nextInt();

            map.put(name, mark);
        }

        String target = sc.next();

        if (map.containsKey(target)) {
            System.out.println(map.get(target));
        } else {
            System.out.println("Not found");
        }
        sc.close();
    }
}

// input:
// 3
// Arun 85
// Priya 90
// Ravi 78
// Priya

// output:
// 90