import java.util.Scanner;
public class HiLo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // creates a random number for the user to guess
        int theNumber = (int)(Math.random() * 100 + 1);

        int guess = 0;

        System.out.println("Pick a number 1-1000: ");

        guess  = scan.nextInt();

        System.out.println("You entered " + guess + ".");

       while (guess != theNumber)
       {
           if(guess < theNumber)
           {
               System.out.println("Your guess is too low. Pick another number: ");
               guess  = scan.nextInt();
           }
           else
           {
               System.out.println("Your guess is too high. Pick another number: ");
               guess  = scan.nextInt();
           }
       }

       System.out.println("Congrats you picked the right number! The correct number was " + theNumber + "!");




    }
}
