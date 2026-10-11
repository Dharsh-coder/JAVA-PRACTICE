package linkedlist;

// Remove duplicates from a LinkedList
// Input:
// 7
// 10 20 10 30 20 40 30


// Expected output:
// [10, 20, 30, 40]

import java.util.*;

public class Duplicates {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        LinkedHashSet<Integer> unique = new LinkedHashSet<>(list);

        list = new LinkedList<>(unique);


        // Step B: Convert unique back to LinkedList


        System.out.println(list);
        sc.close();
    }
}

