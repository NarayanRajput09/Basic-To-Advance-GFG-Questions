package Array;

public class MissingNumber {
       public static void main(String[] args) {
    
        int  []arr={5,6,2,4,8};
        int miss =4;
    }

    public static int missingNumber(int[] arr) {

        int n = arr.length;
        long ogSum = (long) (n * (n + 1)) / 2;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = (long) sum + arr[i];
        }

        int ans = (int) (ogSum - sum);
        return ans;
      
    }

}
