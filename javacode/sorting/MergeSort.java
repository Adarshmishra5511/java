public class MergeSort {
    
  public static void main(String[] args) {
      int[] arr = {12, 11, 13, 5, 6, 7};
      System.out.println("Unsorted array:");
      printArray(arr);

      mergeSort(arr);

      System.out.println("Sorted array:");
      printArray(arr);
  }

  public static void mergeSort(int[] arr) {
      int n = arr.length;
      if (n > 1) {
          int mid = n / 2;
          int[] left = new int[mid];
          int[] right = new int[n - mid];

          // Split the array into two halves
          for (int i = 0; i < mid; i++) {
              left[i] = arr[i];
          }
          for (int i = mid; i < n; i++) {
              right[i - mid] = arr[i];
          }

          // Recursively sort each half
          mergeSort(left);
          mergeSort(right);

          // Merge the sorted halves
          merge(arr, left, right);
      }
  }

  public static void merge(int[] arr, int[] left, int[] right) {
      int n1 = left.length;
      int n2 = right.length;
      int i = 0, j = 0, k = 0;

      // Merge elements from left and right arrays into arr[]
      while (i < n1 && j < n2) {
          if (left[i] <= right[j]) {
              arr[k] = left[i];
              i++;
          } else {
              arr[k] = right[j];
              j++;
          }
          k++;
      }

      // Copy remaining elements of left[] if any
      while (i < n1) {
          arr[k] = left[i];
          i++;
          k++;
      }

      // Copy remaining elements of right[] if any
      while (j < n2) {
          arr[k] = right[j];
          j++;
          k++;
      }
  }

  public static void printArray(int[] arr) {
      for (int value : arr) {
          System.out.print(value + " ");
      }
      System.out.println();
  }
}


  

