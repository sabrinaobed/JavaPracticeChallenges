package in.kgcoding.customComparator;

import java.util.*;

public class customComparatorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sabrina","Obed","Gill");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                }else if(o1.charAt(0) < o2.charAt(0)){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
    }
}
