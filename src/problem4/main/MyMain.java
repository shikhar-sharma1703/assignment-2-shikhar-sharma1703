package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;

        root = new TreeNode(10);

        m.insert(root, 5);

        m.insert(root, 1);

        m.insert(root, 15);

        m.insert(root, 9);

        m.insert(root, 7);

        m.insert(root, 12);

        m.insert(root, 30);

        m.insert(root, 25);

        m.insert(root, 40);

        m.insert(root, 45);

        m.insert(root, 6);
        q.preOrder(root);
        q.queuePrint(q);
        System.out.print("Enter to find preorder Successor : ");

        q.printSuccessor(sc.nextInt());

    }
}