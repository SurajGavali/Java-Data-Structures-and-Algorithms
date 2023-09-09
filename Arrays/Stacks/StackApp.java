package Stacks;

class StackApp{
    public static void main(String[] args){
        Stack stack = new Stack(10);

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