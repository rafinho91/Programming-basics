package trzecie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserInterface {
    public static void main(String[] args) {
        boolean exit = false;
        List<Integer> arrayValues = new ArrayList<>();
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            String inputString = scanner.nextLine();
            String[] splitString = inputString.split(" ");
            String command = splitString[0];
            String value = "";
            if (splitString.length > 1) {
                value = splitString[1];
            }
            switch (command) {
                case "add":
                    System.out.println(command);
                    add(arrayValues, value);
                    break;
                case "show":
                    System.out.println(arrayValues);
                    break;
                case "remove":
                    remove(arrayValues, value);
                    break;
                case "generate":
                    createList(arrayValues, value);
                    break;
                case "exit":
                    exit = true;
                    break;
                case "sort":
                    sort(arrayValues, value);
                    break;

                default:
                    System.out.println("Invalid command!");
            }
        }

    }

    private static void sort(List<Integer> list, String sortType) {
        Integer[] temp = list.toArray(new Integer[list.size()]);
        switch (sortType) {
            case "bubble":
                BubbleSort.bubbleSort(temp);
                break;
            case "insertion":
                InsertionSort.insertionSort(temp);
                break;
            default:
                System.out.println("Invalid command");
        }
        System.out.println(Arrays.asList(temp));
    }

    private static void createList(List<Integer> list, String value) {
        int n = Integer.parseInt(value);
        for (int i = 0; i < n; i++) {
            int x = ThreadLocalRandom.current().nextInt(100);
            list.add(x);
        }
    }

    private static void remove(List<Integer> arrayValues, String value) {
        int n = Integer.parseInt(value);
        if (n < arrayValues.size()) {
            arrayValues.remove(value);
        } else {
            System.out.println("Wrong command!");
        }
    }

    private static void add(List list, String valueToAdd) {
        list.add(valueToAdd);
    }
}
