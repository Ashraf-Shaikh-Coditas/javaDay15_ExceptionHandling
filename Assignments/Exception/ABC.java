package Week4.Day15.Assignments.Exception;

public class ABC {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;

        for(int i =0;i < 11 ; i++) {
            sum = sum + array[i];
        }
    }
}

/* Case 1 : i < 10

Runs Successfully

* */

/* Case 2 : i < 11

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at Week4.Day15.Assignments.Exception.ABC.main(ABC.java:9)

* */