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
        Node n = new Node(v);
        if (head == null){
            head = n;
        }else{
            Node currentLast = head;
            while(currentLast.next != null){
                currentLast = currentLast.next;
            }
            currentLast.next = n;
        }
        size++;

    }
    public void removeFromFront(){
        if (head != null){
            Node oldHead = head;
            Node newHead = head.getNext();
            oldHead.setNext(null);
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
