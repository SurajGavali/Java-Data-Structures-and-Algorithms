package Stacks;

import Stacks.stack.StackChar;
import Stacks.stack.StackLong;

class Operations {

    public void basicStackOperations(){
        StackLong stack = new StackLong(10);
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

    public void checkDelimeter(){

        String input = "a{b(c)d]e";
        StackChar stack = new StackChar(input.length());

        for(int i =0;i<input.length();i++){

            char ch = input.charAt(i);

            switch(ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    //
                    if(!stack.isEmpty()){

                        char charAtTop = stack.pop();
                        if((ch == '}' && charAtTop != '{') || (ch == ']' && charAtTop != '[') || (ch == ')' && charAtTop != '(')){
                            System.out.println("Error :: "+ch+" at "+i);
                        }
                    } else{
                        System.out.println("Empty stack !");
                    }
                    break;
                default:
                    break;
            }
            //System.out.println(stack.peek());
        }

        if(!stack.isEmpty()){
            System.out.println("Error :: missing right delimeter");
        }
    }
}
