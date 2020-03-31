package problem5.node;

import problem5.student.Student;

public class Node {
    private Student data;
    private Node next;

    public Node(Student data) {
        this.data = data;
        next = null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}