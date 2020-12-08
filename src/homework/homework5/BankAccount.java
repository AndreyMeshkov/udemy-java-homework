package homework.homework5;

public class BankAccount {
    int balance;
    void replenishment(int value){
        balance += value;
    }
    void withdrawal(int value) {
        balance -= value;
    }
}
class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.balance = 1000;
        System.out.println("Баланс счета: " + ba.balance);
        ba.replenishment(300);
        System.out.println("Баланс счета после пополнения: " + ba.balance);
        ba.withdrawal(200);
        System.out.println("Баланс счета после снятия: " + ba.balance);
    }
}