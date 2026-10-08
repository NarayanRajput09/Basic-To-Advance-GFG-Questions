package Array;

import java.util.Arrays;

public class RemoveDupliSho {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5 };

        int[] res = remove(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] remove(int[] arr) {
        int[] res = new int[arr.length];

        res[0] = arr[0];

        int idx = 1;

        for (int i = 1; i < arr.length; i++) {
            int pre = arr[i - 1];
            int curr = arr[i];

            if (pre != curr) {
                res[idx] = curr;
                idx++;
            }
        }
        return res;
    }
    
}
