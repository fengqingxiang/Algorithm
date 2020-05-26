package insertsort_插入排序;

import utils.SortUtil;

public class InsertSort {

    public static void insertSort(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(array[j]>array[j+1]){
                    SortUtil.swap(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = SortUtil.createRandomArray();
        SortUtil.printArray(array);
        System.out.println();
        insertSort(array);
        SortUtil.printArray(array);
    }
}
