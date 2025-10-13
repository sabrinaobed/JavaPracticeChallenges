import java.util.Scanner;

public class BreakInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter you command: ");
            String command = input.next();
            if(command.equals("exit")){ //you can also equalsIgnoreCae in case of string only
                break;
            }
        }
        System.out.println("You have successfully exited!");
    }
}
