package deque;
// Given the input numbers, use an ArrayDeque as a stack. 
// Push all numbers, pop one element, then print the popped element and the new top.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Sample input:
// 4
// 10 20 30 40


// Expected output:
// 40
// 30
public class stack {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Deque<Integer> stack = new ArrayDeque<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        stack.push(z);
      }
      
      System.out.println(stack.pop());
      System.out.println(stack.peek());
      sc.close();
    }
}
