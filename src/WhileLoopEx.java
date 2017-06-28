import java.util.Scanner;

/**
 * Created by Steve on 6/28/2017.
 * Example and Demo of while loop specifically for continue choice (y/n)
 */
public class WhileLoopEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        //To compare strings use .equals() or .equalsIgnoreCase()

        //boolean case to check in loop is if the variable choice is equal to y
        while (choice.equalsIgnoreCase("y")){

            //get some input from the user and do some stuff (can write entire programs)
            System.out.println("Continue? (y/n)");
            //need to put scanner object that you created. Set value of choice to scanner.
            choice = scan.nextLine();
            //as long as a "Y" is entered any code in these brackets will run. Once a different
            //letter has been entered it quits the loop
        }

        System.out.println("Goodbye");

    }
}
