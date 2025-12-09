package Desafios.Generics.CompareTwo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import static Desafios.Generics.CompareTwo.Services.Service.*;

public class Main {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(List.of("1", "2", "2", "3", "3"));
        List<String> arr2 = new ArrayList<>(List.of("3", "1", "1", "2"));

        boolean isSame = compareArrays(arr, arr2);

        if (isSame) {
            System.out.println("The arrays are equals");
        } else {
            System.out.println("The arrays are different");
        }

        isSame = isPermutation(arr, arr2);
        if (isSame) {
            System.out.println("The arrays are permutations");
        } else {
            System.out.println("The arrays aren't permutations");
        }

        isSame = isCyclicRotation(arr, arr2);
        if (isSame) {
            System.out.println("The arrays are Cycling");
        } else {
            System.out.println("The arrays aren't Cycling");
        }

        //Comparator<Integer> compInt = (x, y) -> {return x.equals(y) ? 0 : 1;};
        //isSame = compareArraysWithComp(arr, arr2, compInt);
        if (isSame) {
            System.out.println("The arrays are equals");
        } else {
            System.out.println("The arrays aren't equals");
        }

        isSame = checkUnique(arr, arr2);
        if (isSame) {
            System.out.println("The arrays are unique equals");
        } else {
            System.out.println("The arrays aren't unique equals");
        }


    }
}
