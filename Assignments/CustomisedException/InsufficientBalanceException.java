package Week4.Day15.Assignments.CustomisedException;

public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        System.out.println("Gareeb Ho Tum :: "+message);
    }
}
