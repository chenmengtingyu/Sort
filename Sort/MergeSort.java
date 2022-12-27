package Sort;

import java.util.Random;

public class MergeSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;

    public static void sort(int[] array) {
        compareCount = 0;
        moveCount = 0;
        int[] temp = new int[array.length];
        sort(array, temp, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(array, temp, left, mid);
            sort(array, temp, mid + 1, right);
            merge(array, temp, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            compareCount++;
            if (temp[i] <= temp[j]) {
                moveCount++;
                array[k] = temp[i];
                i++;
            } else {
                moveCount++;
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            moveCount++;
            array[k] = temp[i];
            k++;
            i++;
        }
    }

    public static int getCompareCount() {
        return compareCount;
    }

    public static int getMoveCount() {
        return moveCount;
    }

    public MergeSort() {
        int[] array = new int[30000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        startTime = System.nanoTime();
        MergeSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("比较次数:" + MergeSort.getCompareCount());
        System.out.println("移动次数:" + MergeSort.getMoveCount());
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
