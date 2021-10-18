package SortingAlgorithm;

public class SortingRunner {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int N=3;
        SortingAlgorithm sort= new BubbleSort();
        sort.sort(arr,N);
        SortingAlgorithm sort1= new InsertionSort();
        sort1.sort(arr,N);
        SortingAlgorithm sort2= new SelectionSort();
            sort2.sort(arr,N);
    }
}
