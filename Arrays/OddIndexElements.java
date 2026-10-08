package Array;

public class Oddindex {
         public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 0, 3, 9, 7, 2 };
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println(sum);
        int product = 1;
        for (int i = 1; i < arr.length; i += 2) {
            product *= arr[i];
        }
        System.out.println(product);
     }
}
