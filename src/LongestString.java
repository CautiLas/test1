public class LongestString {
    public static String[] words = {"hola", "mauti", "heladera", "ametralladora", "rifle", "mouse"};
    public static String longestWord = words[0];

    public static String findLongest() {
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
