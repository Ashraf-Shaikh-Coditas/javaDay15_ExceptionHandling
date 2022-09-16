package Week4.Day15.Assignments.CustomisedException;

public class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        System.out.println("Please Enter Valid Amount : "+message);
    }
}
