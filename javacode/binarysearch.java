 import java.util.*;
 public class binarysearch {
  public static int binarySearch(int numbers[], int key) {
    int start = 0, end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;//comparig key
      if (numbers[mid] == key) {
        return mid;
      } else if (numbers[mid] < key) {//right
        start = mid + 1;
      } else {//left
        end = mid - 1;
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    //int numbers[] = {2, 4, 6, 8, 12, 14};
   // int key = 4;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array: ");
    int size=sc.nextInt();
    int numbers[]=new int[size];
    System.out.println("enter the elements of array: ");
    for (int i=0;i<size;i++){
      numbers[i]=sc.nextInt();
    }
    System.out.println("enter the key to search: ");
    int key=sc.nextInt();
    System.out.println("Index for key is: " + binarySearch(numbers, key));
  }
}
