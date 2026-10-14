package Tree;

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
public class traversal {

    static Node buildTree(Scanner sc){
        int value = sc.nextInt();

        if(value==-1){
            return null;
        }

        Node node = new Node(value);
        node.left = buildTree(sc);
        node.right=buildTree(sc);

        return node;
    }

    static void preOrder(Node root){

        if(root==null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){

        if(root==null){
            return;
        }

        
        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.right);
    }

    static void postOrder(Node root){

        if(root==null){
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTree(sc);

        System.out.println("Preorder:");
        preOrder(root);
        System.out.println("Inorder:");
        inOrder(root);
        System.out.println("Postorder:");
        postOrder(root);
        sc.close();
    }
}


// Input:
// 10
// 8
// -1
// -1
// 20
// 25
// -1
// -1
// -1

// output:
// Preorder:
// 10
// 8
// 20
// 25
// Inorder:
// 8
// 10
// 20
// 25
// Postorder:
// 8
// 20
// 25
// 10
