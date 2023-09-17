
import java.util.*;


public class Subarray {
  public static void printSubarray(int numbers[]) {
    int ts =0;//for calculating array
    for(int i=0;i<numbers.length;i++){
      int start=i;
    for(int j=i+1;j<numbers.length;j++){
      int end =j;
      for (int k=start;k<=end;k++){
        System.out.println(numbers [k]+" ");
      } 
      System.out.println(); 
      ts++;
    }
  }
    
  
  System.out.println("total numbers of array: "+ ts);
}

public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the size of subarray: ");
  int size=sc.nextInt();
  int numbers[]=new int[size];
   System.out.println("enter the elements of array; ");
   for (int i=0;i<size;i++){
   numbers[i]=sc.nextInt();
   }
   printSubarray(numbers);
   
}
}
