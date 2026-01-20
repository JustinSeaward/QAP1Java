package Problem1;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    private int amount;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance(int i){
        return balance;
    }

    public int credit(int amount){
        balance = amount + balance;
       return balance;
    }

    public int debt(int amount){
        if(amount <= balance ){
            return amount - balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){

        }
    }

}
