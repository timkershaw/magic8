// Magic 8 Ball App
// Importing Scanner and Random
import java.util.Scanner;
import java.util.Random;

public class Magic8 {
    public static  void  main(String[] arg) {

        Scanner keyboardInput = new Scanner(System.in);
        //Creating Random instance
        Random randomInt = new Random();

        // Creating the question variable
        String question;
        // Creating a random variable that will generates random numbers between 1 and 3
        int random = randomInt.nextInt(3) + 1;

        // Creating the answer variable
        String answer;

        System.out.println("Please ask any question:");
        question = keyboardInput.nextLine();

        if (random == 1) {
            answer = "Yes";
        } else if (random == 2) {
            answer = "No";
        } else {
            answer = "Ask again at a later time!";
        }
        System.out.println(answer);
    }
}
