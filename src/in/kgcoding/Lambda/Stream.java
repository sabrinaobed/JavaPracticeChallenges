package in.kgcoding.Lambda;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> names = List.of("Sabrina","Obed","Gill");
        names.stream()
        .forEach(name -> System.out.println(name));
    }
}
