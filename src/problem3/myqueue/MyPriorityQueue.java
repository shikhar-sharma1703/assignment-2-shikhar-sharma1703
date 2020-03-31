package problem3.myqueue;

import problem3.Student;
import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue() {
        rear = null;
        front = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;
            size++;
        } else {
            Node temp = front;
            int k = node.compareTo(temp.getData());
            if (k > 0) {
                node.setNext(temp);
                front = node;
                size++;

            } else if (k <= 0) {
                if (node.getData().getRollNo() > rear.getData().getRollNo()) {
                    rear.setNext(node);
                    rear = node;
                    size++;
                } else {
                    Node first = front;
                    while (first.getNext() != null) {
                        if (node.getData().getRollNo() < (first.getNext()).getData().getRollNo() && node.getData().getRollNo() > first.getData().getRollNo()) {
                            node.setNext(first.getNext());
                            first.setNext(node);
                            size++;
                            break;
                        }
                    }
                }
            }


        }
    }


    public void show() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void peek() {
        System.out.println(front.getData());
    }

}
