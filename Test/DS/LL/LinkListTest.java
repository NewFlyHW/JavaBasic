package DS.LL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    LinkList ll=new LinkList();


    @org.junit.jupiter.api.Test
    void linkEmpty() {
        Assertions.assertEquals(0,ll.size);
    }

    @Test
    void insert(){
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        Assertions.assertEquals(3,ll.size);
    }
}