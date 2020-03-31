package problem4.myqueue;

import problem1.node.TreeNode;

public class MyQueue {
    private Node front, end, tmp;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        tmp = null;
        size = 0;

    }

    public int getSize(MyQueue queue) {
        queue.tmp = queue.front;
        while (queue.tmp != null) {
            ++size;
            queue.tmp = queue.tmp.getNext();
        }
        queue.tmp = queue.front;
        return size;

    }

    public void setSize(int size) {

        this.size = size;

    }

    public Node getFront() {

        return front;

    }


    public void setFront(Node front) {

        this.front = front;

    }


    public Node getEnd() {

        return end;

    }


    public void setEnd(Node end) {

        this.end = end;

    }


    public Node getTmp() {

        return tmp;

    }


    public void setTmp(Node tmp) {

        this.tmp = tmp;

    }

    public void queuePrint(MyQueue queue) {

        while (queue.tmp != null) {


            System.out.print(queue.tmp.getNode().getData() + ",");

            queue.tmp = queue.tmp.getNext();

        }

        System.out.println("\b");

        queue.tmp = queue.front;

    }

    public void enqueue(Node node) {


        if (front == null) {

            tmp = front = end = node;

        } else {

            while (tmp.getNext() != null) {

                tmp = tmp.getNext();

            }

            end = node;

            tmp.setNext(node);

            tmp = front;

        }

    }

    public void preOrder(TreeNode node) {

        if (node == null) {

            return;

        }


        enqueue(new Node(node));

        preOrder(node.getLeft());

        preOrder(node.getRight());

    }

    public void printSuccessor(int data) {


        tmp = front;

        while (tmp.getNode().getData() != data && tmp != null) {

            tmp = tmp.getNext();

        }

        try {

            assert tmp != null;

            System.out.println(tmp.getNext().getNode().getData());

        } catch (NullPointerException ignore) {

            System.out.println("No preorder Successor found");

        }


    }


}