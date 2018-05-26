package drugie;

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(countFactorial(5));
        System.out.println(fibonacci(14));

    }

    private static int fibonacci(int value){
        if (value <= 0){
            return 0;
        }
        if (value == 1) {
            return 1;
        }
        return fibonacci(value-1) + fibonacci(value-2);
    }

    private static int countFactorial(int value) {
        if (value == 1){
            return 1;
        }
        return value * countFactorial(value-1);
    }
}
