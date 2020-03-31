package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> q;

    public TreeNode insert(TreeNode root, int x) {

        if (root == null)

            return new TreeNode(x);

        else if (x > root.getData()) // x is greater. Should be inserted to right

            root.setRight(insert(root.getRight(), x));

        else // x is smaller should be inserted to left

            root.setLeft(insert(root.getLeft(), x));

        return root;

    }

    public void inorderRec(TreeNode root) {

        if (root.getLeft() != null) {

            inorderRec(root.getLeft());

            System.out.println(root.getData());

            inorderRec(root.getRight());

        }

    }

    public void countNodeWithOutLeftChild(TreeNode root) {

        // If tree is empty

        if (root == null)

            return;


        // Do level order traversal starting from root

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);


        int count = 0; // Initialize count of half nodes

        while (queue != null) {

            TreeNode temp = queue.poll();

            if (temp == null) {

                break;

            }


            if (temp.getLeft() == null)

                count++;


            // Enqueue left child

            if (temp.getLeft() != null)

                queue.add(temp.getLeft());


            // Enqueue right child

            if (temp.getRight() != null)

                queue.add(temp.getRight());

        }

        System.out.println("count of Nodes without left child: " + count);

    }

    public void printLeftTree(TreeNode root) {

        if (root == null)

            return;


        // add root

        q.add(root);


        // Delimiter

        q.add(null);


        while (q.size() > 0) {

            TreeNode temp = q.peek();


            if (temp != null) {


                // Prints first node

                // of each level

                System.out.print(temp.getData() + " ");


                // add children of all nodes at

                // current level

                while (q.peek() != null) {


                    // If left child is present

                    // add into queue

                    if (temp.getLeft() != null)

                        q.add(temp.getLeft());


                    // If right child is present

                    // add into queue

                    if (temp.getRight() != null)

                        q.add(temp.getRight());


                    // remove the current node

                    q.remove();


                    temp = q.peek();

                }

                q.add(null);

            }


            // remove the delimiter of

            // the previous level

            q.remove();

        }

    }

    public void leftView(TreeNode root) {

        // Queue to store all

        // the nodes of the tree

        q = new LinkedList<TreeNode>();


        printLeftTree(root);

    }
}
