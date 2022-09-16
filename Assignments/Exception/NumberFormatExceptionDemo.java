package Week4.Day15.Assignments.Exception;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        int num = 10;
        String s1 = "Ab";

        try {
            int num2 = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Occurred...");
            e.printStackTrace();
        }


    }
}

/*

NumberFormatException Occurred...
java.lang.NumberFormatException: For input string: "Ab"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Week4.Day15.Assignments.Exception.NumberFormatExceptionDemo.main(NumberFormatExceptionDemo.java:9)


* */