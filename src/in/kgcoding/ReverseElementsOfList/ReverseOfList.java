package in.kgcoding.ReverseElementsOfList;

import in.kgcoding.ListSwapping.ListSwappingExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOfList {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        //Collections.reverse(list);

        //reverse list through swapping logic
        for (int i = 0; i < list.size()/2; i++) {
            ListSwappingExample.swap(list,i,list.size()-1-i);
        }
    }
}
