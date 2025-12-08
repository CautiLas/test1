public class ShortestString {
    public static String words[] = {"lau", "hola", "ab", "a", "heladera"};
    public static String shortestWord = words[0];

public static String findShortest(){
for (int i = 1; i < words.length; i++){
    if (words[i].length() < shortestWord.length()){
        shortestWord = words[i];
    }
}
return shortestWord;
}
}
