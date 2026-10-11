package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Read n integers into a LinkedList, sort them in ascending order, and print the list.
// Example input:
// 5
// 40 10 30 20 50


// Expected output:
// [10, 20, 30, 40, 50]

public class Sorting {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        list.add(z);
      }
     
      Collections.sort(list);
      System.out.println(list);
      sc.close();
}
}
