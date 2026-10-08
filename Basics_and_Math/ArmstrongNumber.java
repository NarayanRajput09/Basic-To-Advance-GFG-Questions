public class Armsrong {
  public static void main(String[] args) {
    int n =153;
    int sum =0;
    for(int i=0;i<=n;i++){
        int ld =n%10;
        sum = sum + ld*ld*ld;
        if(sum==0);
        n=n/10;
    }
    System.out.println(sum);
  }  
}
