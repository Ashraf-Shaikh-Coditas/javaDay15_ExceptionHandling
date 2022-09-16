package Week4.Day15.Assignments.CustomisedException;

public class BankUser {

    int balance;

    public void addMoney(int amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Enter amount greater than 0.");
        }
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Oops . you dont have enough money");
        }
    }

    public static void main(String[] args) {
        BankUser bankUser = new BankUser();
        try {
            bankUser.addMoney(1000);
            bankUser.withdraw(11000);
        } catch (InvalidAmountException e) {
            throw new RuntimeException(e);
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

Please Enter Valid Amount : Enter amount greater than 0.
Exception in thread "main" java.lang.RuntimeException: Week4.Day15.Assignments.CustomisedException.InvalidAmountException
	at Week4.Day15.Assignments.CustomisedException.BankUser.main(BankUser.java:25)
Caused by: Week4.Day15.Assignments.CustomisedException.InvalidAmountException
	at Week4.Day15.Assignments.CustomisedException.BankUser.addMoney(BankUser.java:9)
	at Week4.Day15.Assignments.CustomisedException.BankUser.main(BankUser.java:22)



* */

/*

Gareeb Ho Tum :: Oops . you dont have enough money
Exception in thread "main" java.lang.RuntimeException: Week4.Day15.Assignments.CustomisedException.InsufficientBalanceException
	at Week4.Day15.Assignments.CustomisedException.BankUser.main(BankUser.java:27)
Caused by: Week4.Day15.Assignments.CustomisedException.InsufficientBalanceException
	at Week4.Day15.Assignments.CustomisedException.BankUser.withdraw(BankUser.java:15)
	at Week4.Day15.Assignments.CustomisedException.BankUser.main(BankUser.java:23)


* */
