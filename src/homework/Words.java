package homework;

/**
 * Created by prots on 14.05.2017.
 */
public class Words {
    public String longestWord(String word1, String word2, String word3, String word4, String word5) {
        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();
        int length4 = word4.length();
        int length5 = word5.length();

        int[] lengh = {length1, length2, length3, length4, length5};
        String[] words = {word1, word2, word3, word4, word5};
        int max = 0;
        int index = -1;
        for (int i = 0; i < lengh.length; i++) {
            if (lengh[i] > max) {
                max = lengh[i];
                index = i;
            }
        }
        return words[index];
    }

    public static void main(String[] args) {
        String word1 = "automation",
                word2 = "hardware",
                word3 = "software",
                word4 = "LAN",
                word5 = "router";
        Words words = new Words();
        System.out.println(words.longestWord(word1, word2, word3, word4, word5));
    }
}
