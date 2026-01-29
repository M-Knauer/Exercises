package Desafios.POO.Inventories;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory (ArrayList<Product> products) {
        this.products = products;
    }

    public Inventory() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void checkStock() {
        if (products.size() <= 1 ) {
            System.out.println("The product is running out of stock.");
        } else {
            System.out.println("Stock is ok.");
        }
    }


    public void toView() {
        System.out.println("Products: ");
        products.forEach(p -> {
            System.out.println(p.getName());
        });
    }
}
