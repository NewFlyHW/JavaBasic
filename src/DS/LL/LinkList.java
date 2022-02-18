package DS.LL;

public class LinkList {

    Node head;
    LinkList(){}


    public void Display(){
        Node node = head;

        if(node == null){
            System.out.println("The list has no value. ");
        }
        else{
            System.out.println("The list are: ");
            while(node.next != null){
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }

    }


    public void insert(int data){
        Node node =new Node();
        node.data = data;
        node.next = null;
        Node tmp = head;

        if(head == null){
            head = node;
        }
        else
        {
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;

        }
    }


    public void insertAt(int pos, int data){}


    public void insertAtStart(int data){}


    public void deleteAt(int pos){}


    public void linkLength(){}
}
