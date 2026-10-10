package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

// Read n student records. Then read a student's name and a new mark. 
// Update the mark if the student exists. Otherwise, print Not found. 
// Print the updated map and its size when the student exists.
public class Update {
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
        int newMark = sc.nextInt();

        if (map.containsKey(target)) {
            map.put(target, newMark);

            System.out.println(map);
            System.out.println(map.size());
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
// Arun
// 95

// output:
// {Arun=95, Priya=90, Ravi=78}
// 3
