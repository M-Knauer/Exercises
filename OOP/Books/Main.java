package Desafios.POO.Books;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Cu de ampola ", "Lua",
                "15213226");
        Book book1 = new Book("Cu de ampola 2 ", "Lua",
                "15213227");

        Storage<Object> storage = new Storage<>();

        storage.addObj(book);
        storage.addObj(book1);
        System.out.println(storage);
        storage.removeObj(book);
        System.out.println(storage);
    }
}
