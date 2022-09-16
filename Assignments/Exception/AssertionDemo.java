package Week4.Day15.Assignments.Exception;

public class AssertionDemo {
    public static void main(String[] args) {
        int age = -10;

        assert (age > 0 && age < 100) : "Age Invalid";

        if(age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
    }
}

/*

Exception in thread "main" java.lang.AssertionError: Age Invalid
	at Week4.Day15.Assignments.Exception.AssertionDemo.main(AssertionDemo.java:7)


* */