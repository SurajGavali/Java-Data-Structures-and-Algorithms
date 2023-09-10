package Stacks;

import Stacks.stack.StackLong;

class StackApp{
    DelimeterMatching delimeter = new DelimeterMatching();
    public static void main(String[] args){
        StackLong stack = new StackLong(10);

        DelimeterMatching delimeterMatching = new DelimeterMatching();
        delimeterMatching.check();


        stack.push(30);
        stack.push(20);
        stack.push(70);
        stack.push(40);
        stack.push(90);

        while(!stack.isEmpty()){
            long value = stack.pop();
            System.out.print(value + " ");  
        }
        System.out.println();
    }
}