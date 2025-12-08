import org.apache.commons.math3.primes.Primes;

public class primeNumbers {
    public static int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static int calcAddition() {
        int addition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!Primes.isPrime(numbers[i])) {
                addition += numbers[i];
            }

        }
        return addition;
    }
}
