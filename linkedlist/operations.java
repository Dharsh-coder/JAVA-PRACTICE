package linkedlist;
// Problem: Write a Java program that:
// 1. Reads n integers and stores them in a LinkedList.
// 2. Adds a number x at the beginning.
// 3. Adds a number y at the end.
// 4. Removes the first element.
// 5. Prints the final list and its size.
// Example
// Input:
// 3
// 10 20 30
// 5
// 40

import java.util.LinkedList;
import java.util.Scanner;

// Expected output:
// [10, 20, 30, 40]
// 4

public class operations {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        list.add(z);
      }
      int x = sc.nextInt();
      list.addFirst(x);
      int y = sc.nextInt();
      list.addLast(y);
      list.removeFirst();
      System.out.println(list);
      System.out.println(list.size());
      sc.close();
    }
}
