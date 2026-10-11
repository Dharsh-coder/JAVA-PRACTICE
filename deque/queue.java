package deque;
// Problem: Read n integers and insert them into a queue. Then:
// 1. Remove the front element.
// 2. Print the removed element.
// 3. Print the new front element.
// 4. Print the remaining queue.
// Sample input:
// 4
// 10 20 30 40

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Expected output:
// 10
// 20
// [20, 30, 40]
public class queue {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Deque<Integer> queue = new ArrayDeque<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        queue.offer(z);
      }
      System.out.println(queue.poll());
      System.out.println(queue.peek());
      System.out.println(queue);
      sc.close();
    }
}
