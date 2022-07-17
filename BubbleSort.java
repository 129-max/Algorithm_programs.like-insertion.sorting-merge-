
public class BubbleSort {

    public static void main(String[] args) {
        Algorithm_Utility algorithmUtility = new Algorithm_Utility();
        Integer arr[] = {64, 34, 25, 12, 22, 11, 90};
        algorithmUtility.bubbleSort(arr);
        int n = arr.length;
        System.out.println("Sorted array");
        Algorithm_Utility.printArray(arr, n);

    }

}