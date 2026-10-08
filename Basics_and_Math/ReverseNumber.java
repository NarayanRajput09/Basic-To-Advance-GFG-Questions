public class reverseNumber {
    public static void main(String[] args) {
        int n=456123;
        int reverse =0;
        for(int i=0;i<=n;i++){
           int ld=n%10;
           reverse=reverse*10+ld;
           n=n/10;
        }
         System.out.println(reverse);
    }
}
