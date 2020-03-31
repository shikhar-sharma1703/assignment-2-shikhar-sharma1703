package problem5.circularqueue;


import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private static Node rear;
    private static int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

    private static boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

    public static boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }

    }

    public Node getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    public int remove() {
        int k = 0;
        int l = 0;
        Node head = rear.getNext();
        while (l < size) {
            if (head.getData().getBacklogCount() == 0) {
                ++k;
                System.out.println(head.getData().getStudentName());
                head = head.getNext();
                ++l;
            } else {
                head = head.getNext();
                ++l;
            }
        }
        return k;
    }
}