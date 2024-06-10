package org.example.DoublyLinkList;

public class DoublyLinkList {

    public Node head;

    public void insertAtHead(int v){

        Node n = createNewNode(v);

        if(head == null){
            head = n;
            return;
        }

        head.prev = n;
        n.next = head;
        head = n;

    }

    public void insertAtEnd(int n){
        Node node = new Node();
        node.data = n;

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;

    }

    public Node createNewNode(int v){
        Node n = new Node();

        n.data = v;
        n.next = null;
        n.prev = null;

        return n;
    }

    public void printDoublyLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printDoublyLinkedListReverse(){
        Node temp = head;
        if (temp == null)
            return;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

}
