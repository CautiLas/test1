public class ArrayAddition {
    public static int numbers[] = {1,3,6,8,7,9};
    public static int totalAddition = numbers[0];
    public static int calcAddition(){
        for (int i = 1; i< numbers.length; i++){
            totalAddition += numbers[i];
        }
        return totalAddition;
    }
}
