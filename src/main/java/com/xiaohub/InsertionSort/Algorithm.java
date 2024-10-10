package com.xiaohub.InsertionSort;

public class Algorithm {

    private Algorithm() {
    }

    /**
     * 初始数组：[5, 2, 8, 12, 1, 6]
     * <p>
     * i = 1:
     *      current = arr[1] = 2
     *      j = i - 1 = 0
     *      arr[j] = arr[0] = 5
     *      while 循环：
     *          5 > 2，所以 arr[1] = arr[0]
     *          数组变为：[5, 5, 8, 12, 1, 6]
     *          j 减为 -1，循环结束
     *      arr[j+1] = current，即 arr[0] = 2
     *      结果：[2, 5, 8, 12, 1, 6]
     * i = 2:
     *      current = arr[2] = 8
     *      j = i - 1 = 1
     *      arr[j] = arr[1] = 5
     *          while 循环：5 < 8，不进入循环
     *          arr[j+1] = current，即 arr[2] = 8（无变化）
     *      结果：[2, 5, 8, 12, 1, 6]
     * i = 3:
     *      current = arr[3] = 12
     *      j = i - 1 = 2
     *      arr[j] = arr[2] = 8
     *          while 循环：8 < 12，不进入循环
     *          arr[j+1] = current，即 arr[3] = 12（无变化）
     *      结果：[2, 5, 8, 12, 1, 6]
     * i = 4:
     *      current = arr[4] = 1
     *      j = i - 1 = 3
     *      arr[j] = arr[3] = 12
     *          while 循环：
     *          12 > 1，所以 arr[4] = arr[3]，j = 2       =>  [2, 5, 8, 12, 12, 6]
     *          8 > 1，所以 arr[3] = arr[2]，j = 1        =>  [2, 5, 8, 8, 12, 6]
     *          5 > 1，所以 arr[2] = arr[1]，j = 0        =>  [2, 5, 5, 8, 12, 6]
     *          2 > 1，所以 arr[1] = arr[0]，j = -1       =>  [2, 2, 5, 8, 12, 6]
     *          循环结束
     *          数组变为：[2, 2, 5, 8, 12, 6]
     *          arr[j+1] = current，即 arr[0] = 1
     *      结果：[1, 2, 5, 8, 12, 6]
     * i = 5:
     *      current = arr[5] = 6
     *      j = i - 1 = 4
     *      arr[j] = arr[4] = 12
     *          while 循环：
     *          12 > 6，所以 arr[5] = arr[4]，j = 3       =>  [1, 2, 5, 8, 12, 12]
     *          8 > 6，所以 arr[4] = arr[3]，j = 2        =>  [1, 2, 5, 8, 8, 12]
     *          5 < 6，循环结束
     *          数组变为：[1, 2, 5, 8, 8, 12]
     *          arr[j+1] = current，即 arr[3] = 6
     *      结果：[1, 2, 5, 6, 8, 12]
     * 最终排序结果：[1, 2, 5, 6, 8, 12]
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 1; i < arr.length; i++) {
            E current = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j].compareTo(current) > 0){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 12, 1, 6};
        Algorithm.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

}
