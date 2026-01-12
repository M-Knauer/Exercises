package Desafios.POO.Banks;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Junior", 10000);
        Account acc2 = new Account("Fábio", 30_000_000);

        Bank.addAccount(acc1);
        Bank.addAccount(acc2);
        System.out.println(Bank.getAccounts());

        Bank.deposit(acc1, 5000);
        System.out.println(Bank.getAccounts());
        Bank.withDraw(acc2, 100000);
        System.out.println(Bank.getAccounts());
        Bank.withDraw(acc1, 100000);
        System.out.println(Bank.getAccounts());


    }

}
