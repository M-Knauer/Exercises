package Desafios.POO.Dogs;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Carlos", "Border Collie");
        System.out.printf("""
                Dog
                Name: %s
                Breed: %s
                """, dog.getName(), dog.getBreed());

        dog.setName("Milei");
        dog.setBreed("Puddle");
        System.out.println();
        System.out.printf("""
                Dog
                Name: %s
                Breed: %s
                """, dog.getName(), dog.getBreed());

    }
}
