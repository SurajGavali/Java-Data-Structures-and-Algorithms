package org.example.LinketList;

import org.example.LinketList.Nodes.Node;

public class LinkedList {

    public Node head;

    public void insertAtEnd(int value){

        Node node = new Node();

        node.data = value;

        if(head == null){
            head = node;
        } else{

            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    public void insertAtStart(int value){

        Node node = new Node();

        node.data = value;

        node.next = head;

        head = node;
    }

    public void insertAt(int index, int value){

        Node node = new Node();

        node.data = value;


        if(index == 0){
            insertAtStart(value);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }


    public void printLinkedList(){

        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }
}
