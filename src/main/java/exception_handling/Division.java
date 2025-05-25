package exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Division {
    private static final Logger logger = Logger.getLogger(Division.class.getName());

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            logger.info("Result is: " + result);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Attempted to divide by zero", e);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Unexpected error", e);
        } finally {
            logger.info("Division operation finished.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
