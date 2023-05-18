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
    public void addToTail(int v){
        if (head == null){
            head = new Node(v);
            size++;
        } else {
            Node n = new Node(v);
            head.setNext(n);
            n.setNext(null);
            size++;
        }
    }
    public void removeFromFront(){
        if (head != null){
            Node oldHead = head;
            Node newHead = head.getNext();
            head = newHead;
            head.setNext(newHead.getNext());
            size--;
        }else if (head == null){
            head = null;
        }
    }
    public void removeTail(){
        if (head == null){
            head = null;
        }
        if (head.next == null) {
            head = null;
            size--;
        }
        Node lastBeforeNull = head;
        while (lastBeforeNull.next.next != null)
            lastBeforeNull = lastBeforeNull.next;
        lastBeforeNull.next = null;
        size--;

    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
