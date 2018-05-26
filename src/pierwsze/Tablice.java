package pierwsze;

import java.util.*;

public class Tablice {
    public static void main(String[] args) {
//        int[] splitArrayInt = createArrayToDisplay();
//        arrayDisplay(splitArrayInt);

//        int[] array = {1,4,78,3};
//        printMaxMin(array);

//        int[] array= {1,2,2,2,1,6,2};
//        findLeader(array);

        Element element = new Element(1);
        Element element2 = new Element(3);
        Element element3 = new Element(5);
        Element element4 = new Element(8);

        MyList myList = new MyList();
        myList.addElementHead(element4);
        myList.addElementHead(element3);
        myList.addElementHead(element2);
        myList.addElementHead(element);

        MyList myList2 = new MyList();
        myList2.addElementTail(element);
        myList2.addElementTail(element2);
        myList2.addElementTail(element3);
        myList2.addElementTail(element4);


        myList.displayList();
        myList.removeElement(element2);
        System.out.println();
        myList.displayList();

    }

    private static void findLeader(int[] array) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer key = array[i];
            Integer value = myMap.get(key);
            if (value != null) {
                value++;
                myMap.put(key,value);
            } else {
                myMap.put(key,1);
            }
        }
        System.out.println(myMap);
        Integer leader = null;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if(entry.getValue() > array.length/2){
                leader = entry.getKey();
            }
        }
        if (leader!=null) {
            System.out.println(leader);
        }else{
            System.out.println(-1);
        }
    }

    private static void printMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min){
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Maximum is: " + max + " on index: " + indexMax);
        System.out.println("Minimum is: " + min + " on index: " + indexMin);
    }

    private static int[] createArrayToDisplay() {
        Scanner scanner = new Scanner(System.in);
        String userArray = scanner.nextLine();
        String[] splitArray = userArray.split(",");
        int[] splitArrayInt = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            splitArrayInt[i] = Integer.valueOf(splitArray[i]);
        }
        return splitArrayInt;
    }

    public static void arrayDisplay (int[] array) {
        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i]);
        }
    }
}
