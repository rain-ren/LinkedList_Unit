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
}