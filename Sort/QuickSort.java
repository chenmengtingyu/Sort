package Sort;

import java.util.Random;

public class QuickSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;

    public static void sort(int[] array) {
        compareCount = 0;
        moveCount = 0;
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            compareCount++;
            if (array[j] < pivot) {
                i++;
                moveCount++;
                swap(array, i, j);
            }
        }
        moveCount++;
        swap(array, i + 1, high);
        return i + 1;
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

    public QuickSort() {
        int[] array = new int[30000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        startTime = System.nanoTime();
        QuickSort.sort(array);
        endTime = System.nanoTime();

        System.out.println("比较次数:" + QuickSort.getCompareCount());
        System.out.println("移动次数:" + QuickSort.getMoveCount());
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
