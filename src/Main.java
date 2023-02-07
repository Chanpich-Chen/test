import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void validate(int userInput) throws exception { // pass exception to caller
        if (userInput < 0) {
            // create and throw exceptio
            throw new exception();
        } else {
            System.out.println("Number is :" + userInput);

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try () {
            int input = sc.nextInt();
            System.out.print("Please input number: ");
            validate(input);

        } catch (exception e) {
            // Throw message
            System.err.println(e.getMessage());
        }


    }

}
