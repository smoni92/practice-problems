package pojo;

public class Node {

    public double data;
    public Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node:: Data " + data;
    }
}
