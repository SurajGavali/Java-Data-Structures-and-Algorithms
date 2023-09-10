package Stacks;

import Stacks.stack.StackChar;

public class DelimeterMatching {
public void check(){

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
