package DS.LL;

public class Runner {
    public Runner(){
        LinkList ll = new LinkList();

        ll.insert(12);
        ll.insert(15);
        ll.insert(17);
        ll.insert(18);
        ll.insert(19);
        ll.insertAt(1,13);
        ll.insertAt(2,14);
        ll.insertAt(4,16);
        ll.insertAtStart(11);
        ll.deleteAt(8);

        ll.Display();
        ll.linkLength();

        Node tmp = ll.head;
        Node n=ll.head.next;
        System.out.println("head: "+tmp.data+", head.next: "+n.data);

    }



}
