package in.kgcoding.StringReturningUniqueCharacters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {
        Set<Character>unique = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your string: ");
        String userStr = input.next();


        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your string has %d unique characters:",unique.size());
    }
}
