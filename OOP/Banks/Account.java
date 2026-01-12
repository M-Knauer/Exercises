package Desafios.POO.Banks;

public class Account {
    private String name;
    private double amountMoney;

    public Account() {}

    public Account(String name, double amountMoney) {
        this.name = name;
        this.amountMoney = amountMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", amountMoney=" + amountMoney +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }
}
