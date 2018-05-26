package trzecie;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of cases:");
        final int size = scanner.nextInt();
        int[] years = getYears(scanner, size);
        checkLeapYear(years);
    }

    private static void checkLeapYear(int[] years) {
        for (int i = 0; i < years.length; i++) {
            if((years[i] % 4 == 0 && years[i] % 100 != 0) || years[i] % 400 == 0){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
    }

    private static int[] getYears(Scanner scanner, int size) {
        int[] years = new int[size];
        for (int i = 0; i < size; i++) {
            years[i] = scanner.nextInt();
        }
        return years;
    }
}
