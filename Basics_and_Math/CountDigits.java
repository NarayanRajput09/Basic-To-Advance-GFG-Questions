public class countDigit {
    public static void main(String[] args) {
        int n =56987;
        int count=0;
        for(int i=0;i<=n;i++){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
