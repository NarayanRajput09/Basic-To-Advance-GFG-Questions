package String;

public class Toggle {
        public static void main(String[] args) {
        String str = "Hey I AM sAurABH";

        String ans = convert(str);

        System.out.println(ans);
    }

    public static String convert(String str) {
        if (str.length() == 0) {
            return str;
        }
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }

            ans += ch;
        }
        return ans;
    }
}
