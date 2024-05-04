import java.util.Scanner;
public class HiLo
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int guess = 0;
        String playAgain = "";

        // creates a random number for the user to guess
        int theNumber = (int) (Math.random() * 100 + 1);
        do {
            System.out.println("Pick a number 1-100: ");
            guess = scan.nextInt();

            System.out.println("You entered " + guess + ".");

            while (guess != theNumber) {
                if (guess < theNumber) {
                    System.out.println("Your guess is too low. Pick another number: ");
                    guess = scan.nextInt();
                } else {
                    System.out.println("Your guess is too high. Pick another number: ");
                    guess = scan.nextInt();
                }
            }

            System.out.println("Congrats you picked the right number! The correct number was " + theNumber + "!");
            System.out.println("Would you like to play again? Type either Y for yes or N for no. ");
            playAgain = scan.next();

        }while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing the guessing game! Goodbye!");
        scan.close();
    }
}
