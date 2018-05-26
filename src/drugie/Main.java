package drugie;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Element firstElement = new Element(1);
        Element secondElement = new Element(2);
        Element thirdElement = new Element(3);
        MyStack myStack = new MyStack();
        myStack.push(firstElement);
        myStack.push(secondElement);
        myStack.push(thirdElement);
        myStack.pop();
        myStack.pop();

        Stack<Integer> javaStack = new Stack<>();
        javaStack.push(1);
        javaStack.push(2);
        javaStack.push(3);

        MyQueue myQueue = new MyQueue();
        myQueue.add(firstElement);
        myQueue.add(secondElement);
        myQueue.add(thirdElement);



    }
}
