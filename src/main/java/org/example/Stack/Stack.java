package org.example.Stack;

import org.example.LinketList.Nodes.Node;

public class Stack {

    Node top = null;

    public void push(int n){

        Node node = new Node();

        node.data = n;

        node.next = top;
        top = node;
    }

    public void pop(){
        Node temp;

        if(top == null){
            return;
        }

        temp = top;
        top = top.next;

        temp.next = null;
    }

    public void printStack(){

        Node temp = top;

        if(temp == null){
            System.out.println("Stack is empty!");
            return;
        }
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //we can use stack for solving postfix or infix expressions
    // and also for converting infix to postfix expression
}
