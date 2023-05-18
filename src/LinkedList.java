public class LinkedList {
    private Node head;
    private int size;
    LinkedList(){
        head = null;

    }
    public void addToFront(int v){
        if (head == null){
            head = new Node(v);
            size++;
        } else {
            Node n = new Node(v);
            n.next = head;
            head = n;
            size++;
        }
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
