public class InsertionSorting {




        public static void main(String args[]){
            Algorithm_Utility algorithmUtility = new Algorithm_Utility();
            String []arr = {"hello", "everyone", "how", "are", "you", "all"};
            int n = arr.length;

            algorithmUtility.insertionSort(arr,n);
            algorithmUtility.printArray(arr, n);

        }
    }

