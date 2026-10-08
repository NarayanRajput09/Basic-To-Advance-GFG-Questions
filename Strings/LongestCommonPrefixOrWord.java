package String;

public class Longest {
    
        public static void main(String[] args) {
        // Write a Java program to find the length of the longest word in a string.
        String str = "We are here watching the watchin1";

        findLongestWordAndLength(str);

    }

    public static void findLongestWordAndLength(String str) {
        if (str.length() == 0) {
            return;
        }
        int count = 0;
        int max = 0;
        String countStr = "";
        String maxStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                countStr += ch;
                count++;
            } else {
                if (max < count) {
                    max = count;
                    maxStr = countStr;
                }
                count = 0;
                countStr = "";
            }
        }
        if (max < count) {
            max = count;
            maxStr = countStr;
        }
        System.out.println(max + "  " + maxStr);
    }
}



