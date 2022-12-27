package Sort;

import java.util.Random;

public class HeapSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;

    public static void sort(int[] array) {
        compareCount = 0;
        moveCount = 0;
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            moveCount++;
            swap(array, 0, i);
            heap(array, i, 0);
        }
    }

    private static void heap(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n) {
            compareCount++;
            if (array[l] > array[largest]) {
                largest = l;
            }
        }

        if (r < n) {
            compareCount++;
            if (array[r] > array[largest]) {
                largest = r;
            }
        }

        if (largest != i) {
            moveCount++;
            swap(array, i, largest);
            heap(array, n, largest);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int getCompareCount() {
        return compareCount;
    }

    public static int getMoveCount() {
        return moveCount;
    }

    public HeapSort() {
        int[] array = new int[30000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        startTime = System.nanoTime();
        HeapSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("比较次数:" + HeapSort.getCompareCount());
        System.out.println("移动次数:" + HeapSort.getMoveCount());
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
