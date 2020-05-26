package selectsort_选择排序;

import utils.SortUtil;

public class SelectSort {

    public static void selectSort(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < array.length; i++) {
            int index=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[index]){
                    index=j;
                }
            }
            SortUtil.swap(array,i,index);
        }
    }

    public static void main(String[] args) {
        int[] array = SortUtil.createRandomArray();
        SortUtil.printArray(array);
        System.out.println();
        selectSort(array);
        SortUtil.printArray(array);
    }
}
