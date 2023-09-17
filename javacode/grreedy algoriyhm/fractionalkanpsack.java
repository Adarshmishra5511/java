 import java.util.*;
 public class fractionalkanpsack {
  public static void main(String[] args) {
    int val[]={60,100,120};
    int weigth[]={10,20,30};  
    int W=50;
    //use 2d array to sort
    double ratio[][]=new double[val.length][2];
    //oth=>idx;1th=>ratio
    for(int i=0;i<val.length;i++){
      ratio[i][0]=i;
      ratio[i][1]=val[i]/(double)weigth[i];
    }
      //sort into ascending oordre
      Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
      int capacity=W;
      int finalval=0;
      for(int i=ratio.length-1;i>0;i--){
        int idx=(int)ratio[i][0];
        if(capacity>=weigth[idx]){
        finalval += val[idx];
        capacity -= weigth[idx];       
      }
      else{
        finalval+=(ratio[i][1]*capacity);
        capacity=0;
        break;
      }
    }
    System.out.println("final value="+finalval);
    }
  
}
