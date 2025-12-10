package Desafios.Generics.ReverseGenericList;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.ReverseGenericList.Services.ReverseList.*;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> lstCopy = new ArrayList<String>(List.copyOf(lst));

        System.out.println("Reverse list: "+reverseList(lst));

        reverseInPlace(lstCopy);
        System.out.println("Reverse in place: "+lstCopy);

        lstCopy = new ArrayList<String>(List.copyOf(lst));

        System.out.println("Reverse by recursion: "+reverseListByRecursion(lstCopy, 0, lstCopy.size() - 1));

        System.out.println("Reverse and rotate: "+reverseAndRotateByOffset(lst, 2));
    }
}
