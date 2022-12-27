package Sort;

import java.util.Random;

public class ShellSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;
    public ShellSort() {
        int[] array = new int[30000];
        for (int i = 0; i < 30000; i++) {
            array[i] = random.nextInt();
        }
        startTime = System.nanoTime();
        int gap = array.length;
        while (true) {
            gap = gap / 2;
            if (gap == 0) {
                break;
            }
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < array.length; j += gap) {
                    compareCount++;
                    if (array[j] < array[j - gap]) {
                        int temp = array[j];
                        int k = j - gap;
                        while (k >= 0 && array[k] > temp) {
                            moveCount++;
                            array[k + gap] = array[k];
                            k -= gap;
                        }
                        array[k + gap] = temp;
                    }
                }
            }
        }
        endTime = System.nanoTime();

        System.out.println("比较次数:" + compareCount);
        System.out.println("移动次数:" + moveCount);
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
