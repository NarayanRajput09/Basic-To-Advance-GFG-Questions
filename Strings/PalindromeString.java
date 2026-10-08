package String;

public class palindrome {
    public static void main(String[] args) {
        // Write a Java program to check if a string is a palindrome.
        String str = "RaDAr";
        System.out.println(CheckPlaindrome2(str));
    }

    public static boolean CheckPlaindrome1(String str) {
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans += ch;
        }
        if (str.equals(ans)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean CheckPlaindrome2(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        str = toLowerCase(str);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char chSt = str.charAt(start);
            char chEd = str.charAt(end);

            if (chEd != chSt) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }


    public static String toLowerCase(String str) {
        if (str.length() == 0) {
            return str;
        }

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }

            ans += ch;
        }

        return ans;
    }
}
  



