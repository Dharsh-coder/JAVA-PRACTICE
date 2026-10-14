package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class bfs {
    static Node buildTree(Scanner sc ){
      int value = sc.nextInt();
      if(value==-1){
        return null;
      }
      Node n = new Node(value);
      n.left = buildTree(sc);
      n.right = buildTree(sc);
      return n;
    }

    static void Bfs(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.print(n.data+" ");

            if(n.left!=null){
                queue.offer(n.left);
            }
            if(n.right!=null){
                queue.offer(n.right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTree(sc);

        System.out.println("BFS order :");
        Bfs(root);
        System.out.println();
        
        sc.close();
    }
}
