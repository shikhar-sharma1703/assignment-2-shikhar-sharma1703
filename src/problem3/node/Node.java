package problem3.node;

import problem3.Student;

public class Node {
    private Student data;
    private Node next;

    public Node(Student d) {
        data = d;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public int compareTo(Student data) {
        return data.getRollNo() - this.data.getRollNo();
    }
}