package FileWriteAndReadHandlingWithException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name you want to read: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.println((char)read);
            }
        }catch(FileNotFoundException ex) {
            System.out.printf("Exception occured: %s", ex.getMessage());
        } catch(IOException e){
            System.out.printf("Exception occured: %s",
                    e.getMessage());
        }
    }
}
