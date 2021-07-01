package pojo;

public class Node {

    public double data;
    public Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    public Node(double data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node:: Data " + data;
    }
}
