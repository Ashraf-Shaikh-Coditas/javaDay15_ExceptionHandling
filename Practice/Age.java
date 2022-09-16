package Week4.Day15.Practice;

public class Age {
    public void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not ELIGIBLE !!!",new Throwable("You are minor"));
        }
    }

    public static void main(String[] args) {
        Age age = new Age();

        try {
            age.register(12);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

/*

U are minor : You are not ELIGIBLE !!!
Week4.Day15.Practice.InvalidAgeException
	at Week4.Day15.Practice.Age.register(Age.java:6)
	at Week4.Day15.Practice.Age.main(Age.java:14)


* */