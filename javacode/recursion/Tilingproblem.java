public class Tilingproblem {
  public static int tilingproblem(int n){
    //base case
    if(n==0||n==1){
      return 1;
    }
    //vertical 
    int fnm1=tilingproblem(n-1);
    //horizontal
    int fnm2=tilingproblem(n-2);
    int totalways=fnm1 +fnm2; 
    return totalways;
  }
  public static void main(String[] args) {
    System.out.println(tilingproblem(4));
  }
}
