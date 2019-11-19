import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Example {

    public static void main(String args[]) {
        int[] arr = new int[6];

        try {
            Scanner scr = new Scanner(System.in);
            System.out.println("Please Enter a number?");
            arr[6] = scr.nextInt();

        } catch (InputMismatchException inputError) {
            System.out.println("Wrong Data Type Entered!");
            
        } catch (ArrayIndexOutOfBoundsException indexOut) {
            System.out.println("Array Index is Invalid");

        } finally {
            System.out.println("Bye :)");
        }
    }
}