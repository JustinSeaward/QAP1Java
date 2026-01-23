package Problem1;

public class TestAccount {
    public static void main(String[] args ){
        Account acc1 = new Account("1", "Rusty Shackford", 5000);
        Account acc2 = new Account("2","John Doe",4000);
        System.out.println("");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());
        acc1.transferTo(acc2,1000);
        System.out.println("");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());
    }
}

