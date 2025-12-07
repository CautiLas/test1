public class Palindrome {

    public static boolean isPalindrome(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        if (newWord.equals(word)){
            return true;
        }
        return false;
    }

}
