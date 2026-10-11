package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Read n integers into a LinkedList, reverse the list, and print the result.
// Example:
// Input:
// 5
// 10 20 30 40 50


// Expected output:
// [50, 40, 30, 20, 10]

public class Reverse {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        list.add(z);
      }
     
      Collections.reverse(list);
      System.out.println(list);
      sc.close();
    }
}
