package drugie;

import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int decimalNumber = 6;
        createBinaryNumber(stack, decimalNumber);
        displayBinaryNumber(stack);
    }

    private static void displayBinaryNumber(Stack<Integer> stack) {
        System.out.print("Binary number: ");
        while(!stack.empty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }

    private static void createBinaryNumber(Stack<Integer> stack, int decimalNumber) {
        System.out.println("Decimal number: " + decimalNumber);
        while(decimalNumber > 0) {
            int binaryNumber = decimalNumber%2;
            stack.push(binaryNumber);
            decimalNumber = decimalNumber/2;
        }
    }
}
