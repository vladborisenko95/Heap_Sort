import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 5, 1, 7, 4, 8, 6, 3};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        HeapSort.heapSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}