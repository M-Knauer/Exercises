package Desafios.POO.Banks;

import java.util.ArrayList;

public class Bank {
    private static final ArrayList<Account> accounts = new ArrayList<>();

    public static ArrayList<Account>  getAccounts() {
        return accounts;
    }
    public static void addAccount(Account acc) {
        accounts.add(acc);
    }

    public static void removeAccount(Account acc) {
        accounts.remove(acc);
    }

    public static void deposit(Account acc, double amount) {
        if (accounts.contains(acc)) {
            acc.setAmountMoney(acc.getAmountMoney() + amount);
        } else {
            System.out.println("Conta não cadastrada");
        }
    }

    public static void withDraw(Account acc, double amount) {
        if (accounts.contains(acc)) {
            if ((acc.getAmountMoney() - amount) >= 0) {
                acc.setAmountMoney(acc.getAmountMoney() - amount);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta não cadastrada!");
        }
    }
}
