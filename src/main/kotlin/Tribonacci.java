public class Tribonacci {

    public int tribonacci(int n) {
        int[] tribonacciNumbers = new int[38];
        tribonacciNumbers[0] = 0;
        tribonacciNumbers[1] = 1;
        tribonacciNumbers[2] = 1;
        for (int i = 3; i < 38; i++) {
            tribonacciNumbers[i] = tribonacciNumbers[i - 1] + tribonacciNumbers[i - 2] + tribonacciNumbers[i - 3];
        }
        return tribonacciNumbers[n];
    }
}
