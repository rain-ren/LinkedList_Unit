import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void shouldAddToFront(){
        LinkedList linkedList = new LinkedList();
        linkedList.addToFront(5);
        assertEquals(5, linkedList.getHead().getVal());
        assertEquals(1,linkedList.getSize());

        linkedList.addToFront(10);
        assertEquals(10, linkedList.getHead().getVal());
        assertEquals(5,linkedList.getHead().getNext().getVal());
        assertEquals(2,linkedList.getSize());
    }
    @Test
    public void shouldAddToTail(){
        LinkedList linkedList = new LinkedList();
        linkedList.addToTail(5);
        assertEquals(5, linkedList.getHead().getVal());
        assertEquals(1,linkedList.getSize());

        linkedList.addToTail(10);
        assertEquals(5,linkedList.getHead().getVal());
        assertEquals(10,linkedList.getHead().getNext().getVal());
        assertEquals(2,linkedList.getSize());
    }
    @Test
    public void shouldRemoveFromFront(){
        LinkedList linkedList = new LinkedList();
        linkedList.addToFront(20);
        linkedList.addToFront(15);
        linkedList.addToFront(10);
        linkedList.addToFront(5);

        linkedList.removeFromFront();
        assertEquals(10,linkedList.getHead().getVal());
        assertEquals(15,linkedList.getHead().getNext().getVal());
        assertEquals(3,linkedList.getSize());

    }
    @Test
    public void shouldRemoveTail(){
        LinkedList linkedList = new LinkedList();
        linkedList.addToFront(20);
        linkedList.addToFront(15);
        linkedList.addToFront(10);
        linkedList.addToFront(5);

        linkedList.removeTail();
        assertEquals(5,linkedList.getHead().getVal());
        assertEquals(15,linkedList.getHead().getNext().getNext().getVal());
        assertEquals(3,linkedList.getSize());

    }

    @Test
    public void shouldPerformAllFunctions(){
        LinkedList linkedList = new LinkedList();
        linkedList.addToFront(10);
        linkedList.addToFront(5);
        linkedList.addToTail(15);
        linkedList.addToTail(20);

        assertEquals(5,linkedList.getHead().getVal());
        assertEquals(4,linkedList.getSize());

    }
}