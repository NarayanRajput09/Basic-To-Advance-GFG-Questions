

package String;

public class Compress {

    public static void main(String[] args) {
        String str = "aaaabbbbaaaaccccdeftiiiii";
        String compressed = compress(str);
        System.out.println(compressed);


    }

    public static String compress(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        String ans = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (pre != curr) {
                if (count > 1) {
                    ans += count;
                }
                ans += pre;
                count = 1;
            } else {
                count++;
            }
        }

        if (count > 1) {
            ans += count;
        }
        ans += str.charAt(str.length() - 1);

        return ans;
    }

}
