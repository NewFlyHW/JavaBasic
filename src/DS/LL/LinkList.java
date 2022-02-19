package DS.LL;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class LinkList {

    Node head;
    LinkList(){}
    int size=0;



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
            head.prev = null;
            size++;
        }
        else
        {
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;
            node.prev = tmp;
            size++;

        }
    }


    public void insertAt(int pos, int data){
        Node node= new Node();
        node.data = data;
        node.next = null;
        Node tmp = head;

        if(pos ==0){
            insertAtStart(data);
            size++;
        }
        else{
            for(int i=0; i<pos-1;i++){
                tmp = tmp.next;
            }
            node.next = tmp.next;
            tmp.next = node;
            size++;
        }

    }


    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        size++;
    }


    public void deleteAt(int pos){
        Node tmp = head;

        if(pos ==0){
            head = head.next;
            size--;
        }
        else{
            for(int i=0; i<pos-1;i++){
                tmp = tmp.next;
            }
            Node n = tmp.next;
            tmp.next = n.next;
            n=null;
            size--;
        }

    }


    public void linkLength(){
        System.out.println("Link length is: "+size);
    }
}
