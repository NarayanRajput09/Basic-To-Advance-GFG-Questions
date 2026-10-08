package String;

public class SecondMostFre {
        public static void main(String[] args) {
        // Write a Java program to find the second most frequent character in a string.
        String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";

        int[] frequncyArray = MakeFrequencyArray(str);
        FindSecondMaxCharacterAndFrequency(frequncyArray);

    }

    public static int[] MakeFrequencyArray(String str) {

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                int frequencyIndex = ch - 'A';
                arr[frequencyIndex] = arr[frequencyIndex] + 1;
            } else if (ch >= 'a' && ch <= 'z') {
                int frequencyIndex = ch - 'a';
                arr[frequencyIndex] = arr[frequencyIndex] + 1;
            }
        }

        return arr;
    }

    public static void FindSecondMaxCharacterAndFrequency(int[] arr) {
        int max = 0;
        int smax = 0;
        int maxIdx = 0;
        int smaxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (max < ele) {
                smax = max;
                smaxIdx = maxIdx;
                max = ele;
                maxIdx = i;
            } else if (smax < ele) {
                smax = ele;
                smaxIdx = i;
            }
        }
        char secMostFrequentCharacter = (char) (smaxIdx + 'a');
        System.out.println(secMostFrequentCharacter + " " + smax);
    }
}

