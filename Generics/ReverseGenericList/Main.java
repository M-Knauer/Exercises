package Desafios.Generics.ReverseGenericList;

import java.util.ArrayList;
import java.util.List;

import static Desafios.Generics.ReverseGenericList.Services.ReverseList.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
        System.out.println("Reverse list: "+reverseList(lst));
    }
}
