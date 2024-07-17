package collections;

public class ExceptionsExperiment {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divideNumbers(int dividend, int divisor) throws ArithmeticException{
        return dividend / divisor;
    }
}
