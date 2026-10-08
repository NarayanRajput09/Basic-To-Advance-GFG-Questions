package Array;

import java.util.Arrays;

public class MergeTwoShorted {
        public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        int l1 = arr1.length;
        int l2 = arr2.length;

        int resLength = l1 + l2;
        int[] res = new int[resLength];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p3 < resLength) {
            int ele1 = p1 < l1 ? arr1[p1] : Integer.MAX_VALUE;
            int ele2 = p2 < l2 ? arr2[p2] : Integer.MAX_VALUE;

            if (ele1 < ele2) {
                res[p3] = ele1;
                p1++;
            } else {
                res[p3] = ele2;
                p2++;
            }
            p3++;

        }
        // TimeComplexity - O(n+m);
        // SpaceComplexity - O(n+m);
        System.out.println(Arrays.toString(res));
    }
}

