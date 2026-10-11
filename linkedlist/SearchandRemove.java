package linkedlist;
// Read n integers into a LinkedList, then read a target number x.
// - If x exists in the list, remove its first occurrence.
// - Otherwise, leave the list unchanged.
// - Print the final list.
// Example 1:
// Input:
// 5
// 10 20 30 20 40
// 20

import java.util.LinkedList;
import java.util.Scanner;

// Output:
// [10, 30, 20, 40]

public class SearchandRemove {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        list.add(z);
      }
      int x = sc.nextInt();
      if(list.contains(x)){
        list.remove(Integer.valueOf(x));
      }
      System.out.println(list);
      sc.close();
    }
}
