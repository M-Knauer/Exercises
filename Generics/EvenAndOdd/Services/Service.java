package Desafios.Generics.EvenAndOdd.Services;

import Desafios.Generics.EvenAndOdd.Models.EvenAndOdd;

import java.util.List;

public class Service {
    public static <T extends Number> void sumEvenAndOdd(List<T> a) {
        double sumEven = a.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 0).sum();

        double sumOdd = a.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 1).sum();

        System.out.println("Total of even: "+sumEven);
        System.out.println("Total of odd: "+sumOdd);
    }

    public static <T extends Number> EvenAndOdd getSumEvenAndOdd(List<T> numbers) {
        EvenAndOdd evenOdd = new EvenAndOdd();

        evenOdd.even = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 0).sum();

        evenOdd.odd = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 1).sum();

        return evenOdd;
    }

    public static <T extends Number> double calculateDifference(List<T> numbers) {
        double even = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 0).sum();
        double odd = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 1).sum();

        return even - odd;
    }

    public static <T extends Number> boolean evenIsDivisibleByOdd(List<T> numbers) {
        double even = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 0).sum();

        double odd = numbers.stream().mapToDouble(Number::doubleValue)
                .filter(n -> n % 2 == 1).sum();

        return even % odd == 0;
    }

}

