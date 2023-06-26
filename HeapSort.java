public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;

        Heap.buildHeap(array, n);

        for (int i = n - 1; i > 0; i--) {
            Heap.swap(array, 0, i);
            Heap.heapify(array, i, 0);
        }
    }
}