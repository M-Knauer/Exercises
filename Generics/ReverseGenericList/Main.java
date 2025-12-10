package Desafios.Generics.ReverseGenericList;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.ReverseGenericList.Services.ReverseList.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
        List<Integer> lstCopy = new ArrayList<Integer>(List.copyOf(lst));
        System.out.println("Reverse list: "+reverseList(lst));
        reverseInPlace(lstCopy);
        System.out.println("Reverse in place: "+lstCopy);
        lstCopy = new ArrayList<Integer>(List.copyOf(lst));
        System.out.println("Reverse by recursion: "+reverseListByRecursion(lstCopy, 0, lstCopy.size() - 1));

    }
}
