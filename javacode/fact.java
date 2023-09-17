import java.util.*;

public class fact {
  
    public static int factorial(int n){
      int f=1;
      
      
      for(int i=1 ; i<=n ; i++){
        f=f*i;
      }
      return f;
    }
     public static int binCoeff(int m,int r){
      int facto_m=factorial(m);
      int facto_r=factorial(r);
      int facto_nmr=factorial(m-r);
      int binCoeff=facto_m/(facto_r*facto_nmr);
      return binCoeff ;
     }
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      int m=sc.nextInt();
      int r=sc.nextInt();
      int facto=binCoeff(m,r);
      System.out.println(facto);
    }
  }
  

