package Week4.Day15.Practice;

public class
InvalidAgeException extends Exception {

    InvalidAgeException(String message,Throwable err) {
//        System.out.println("U are minor : "+message);
        super(message,err);
    }

}
