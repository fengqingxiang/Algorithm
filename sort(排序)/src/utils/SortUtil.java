package utils;

import java.util.Random;

public class SortUtil {

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] array, int i, int index) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
}
