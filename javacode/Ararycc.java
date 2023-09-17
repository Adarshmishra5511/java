

import java.util.*;
public class Ararycc {
  public static int linearSearch( int[]number,int key){
    for(int i=0;i<number.length-1;i++){ 
      if (number[i]==key){
      return i;
    }
  }

return -1;
  }
  public static void main(String args[]){
  // System.out.println("the array is : ");

Scanner sc=new Scanner (System.in);
System.out.println("enter the size of array: ");
int size=sc.nextInt();
int numbers[]=new int[size];
System.out.println("enter the elements of array: ");

for (int i=0;i<size;i++){
  numbers[i]=sc.nextInt();
} 
System.out.println("enter the key to search : ");
int key=sc.nextInt();
  System.out.println("enter the key is : "+ linearSearch(numbers,key));

}

  

  }

