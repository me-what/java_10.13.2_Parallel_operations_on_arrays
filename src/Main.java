// Параллельные операции над массивами. Parallel operations on arrays

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice()-10000);
            return phones[i];
        });

        for(Phone p: phones)
            System.out.printf("%s - %d \n", p.getName(), p.getPrice());
        System.out.println();


        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for(int i: nums)
            System.out.println(i);
        System.out.println();


        Phone[] phones2 = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSort(phones2,new PhoneComparator());

        for(Phone p: phones2)
            System.out.println(p.getName());
        System.out.println();


        int[] numbers = {1, 2, 3, 4, 5, 6};
        Arrays.parallelPrefix(numbers, (x, y) -> x * y);

        for(int i: numbers)
            System.out.println(i);
    }
}