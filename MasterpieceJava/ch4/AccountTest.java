package MasterpieceJava.ch4;

class Account {
    private String owner;
    private long balance;

    
    public Account(String owner) {this.owner = owner;}
    public Account(long balance) {this.balance = balance;}
    public Account(String owner, long balance) {this(owner); this.balance = balance;}
    public Account(long balance, String owner) {this(owner); this.balance = balance;}

public String getOwner() {
    return owner;
}

public void setOwner(String owner) {
    this.owner = owner;
}

public long getBalance() {
    return balance;
}

public void setBalance(long balance) {
    this.balance = balance;
}
public long deposit(long amount){
    return this.balance += amount;
}

public long withdraw(long amount){
    long money = amount;
    if(balance < amount){
        money = this.balance;
        System.out.print("잔금이 부족해 현재 잔금만 인출합니다.");}
        System.out.println("인출금액: " + money );
        return this.balance -= money;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account("최여진", 100000);
        act.deposit(200000);
        act.withdraw(100000);
        act.withdraw(400000);
        System.out.printf("%d \n", act.getBalance());
        
    }
    
}

