public class MaxArray {

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    static int maxNumber = numbers[0];

   public static int calcMaxArray() {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }
}
