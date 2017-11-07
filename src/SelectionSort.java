public class SelectionSort {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            // 寻找[i,n)区间里最小值的索引
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex])<0) {
                    minIndex = j;
                }
            }
            swap(arr,i, minIndex);
        }
    }

    private static void swap(Object[] arr,int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Integer[] arr1 = SortTestHelper.generateRandomArray(5000,0,5000);
        sort(arr1);

    }
}
