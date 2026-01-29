package Desafios.POO.Inventories;

public class Main {
    public static void main(String[] args) {

        Inventory inv = new Inventory();
        Product p1 = new Product("Shampoo", 80.00);
        Product p2 = new Product("Condicionador", 90.00);
        inv.addProduct(p1);
        inv.addProduct(p2);

        inv.toView();

        inv.checkStock();
        inv.removeProduct(p1);

        inv.toView();
        inv.checkStock();

    }
}
