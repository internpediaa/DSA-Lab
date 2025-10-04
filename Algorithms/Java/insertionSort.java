public class InsertionSort {
    
    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }
    
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Main method
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
