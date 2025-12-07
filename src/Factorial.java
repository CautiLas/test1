public class Factorial {
    public static int factorialMethod(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;

    }
}

