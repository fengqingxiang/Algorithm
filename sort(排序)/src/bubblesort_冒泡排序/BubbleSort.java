package bubblesort_冒泡排序;

import utils.SortUtil;

public class BubbleSort {

    /**
     * 冒泡排序，每次与下一个值比较，如果下一个值比当前值小就交换两者位置
     * 步骤：
     * 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            //  boolean isSwap=false;  可根据该参数来提前结束排序 最好的情况就是对已有序的数组做排序，只需遍历数组一次即可
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtil.swap(array, j, j + 1);
                    //       isSwap=true;
                }
            }
//            if(!isSwap){
//                break;
//            }
        }
    }

    public static void main(String[] args) {
        int[] array = SortUtil.createRandomArray();
        SortUtil.printArray(array);
        System.out.println();
        bubbleSort(array);
        SortUtil.printArray(array);
    }
}
