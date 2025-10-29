package in.kgcoding.enums;

public class enumTest {
    public static void main(String[] args) {
        System.out.println("Printing all days of the week: ");

        for (daysOfWeek day : daysOfWeek.values()) {
            //System.out.println(day);
            System.out.printf("%s : %s\n" ,day,day.getType());
        }


    }
}
