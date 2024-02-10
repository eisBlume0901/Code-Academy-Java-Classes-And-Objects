public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance()
    {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public int deposit(int amountToDeposit)
    {
        balance += amountToDeposit;
        return amountToDeposit;
    }

    public int withdraw(int amountToWithdraw)
    {
        balance -= amountToWithdraw;
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        System.out.println(savings.deposit(500));
        System.out.println(savings.withdraw(100));

    }
}
