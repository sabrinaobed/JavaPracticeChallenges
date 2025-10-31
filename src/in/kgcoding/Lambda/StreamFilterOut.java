package in.kgcoding.Lambda;

import java.util.List;

public class StreamFilterOut {
    public static void main(String[] args) {
        List<String> strs = List.of("Sabrina is", "learning", "Java", "from", "Youtube");
        String result = strs.stream()
                .filter(str -> str.length() > 5)
                .reduce("",(a,b) -> a + " " + b);
        System.out.println(result);
    }
}
