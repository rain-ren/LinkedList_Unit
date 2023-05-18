public class Node {
    public Node next;
    private int val;

    public Node(int _val){
        val = _val;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
