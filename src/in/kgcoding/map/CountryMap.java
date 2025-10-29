package in.kgcoding.map;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();
        countryMap.put("Sweden","Stockholm");
        countryMap.put("Norway","Oslo");
        countryMap.put("Finland","Helsinki");
        countryMap.put("Denmark","Copenhegen");
        countryMap.put("Pakistan","Islamabad");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter country name: ");
        String name = input.next();

        if(countryMap.containsKey(name)){
            System.out.printf("Capital of %s is %s",name,
                    countryMap.get(name));
        }else{
            System.out.println("Sorry we don't know the capital");
        }
    }


}
