package trzecie;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array = {3,4,5,2,1};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(Integer[] array) {
        int change;
        int tmp;
        do {
            change = 0;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    change++;
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }while (change > 0);
    }
}
