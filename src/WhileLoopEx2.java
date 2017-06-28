/**
 * Created by Steve on 6/28/2017.
 * We are counting up to 4 using a while loop
 */
public class WhileLoopEx2 {
    public static void main(String[] args) {

        int i = 1; // This is our counter variable -- it is common to use single letters like i, j, or k
                   // We initialize outside brackets for while loop because if inside it will initialize every time

        // loop will run as long as our variable is less than or equal to 4
        while (i <= 4) { //this condition is tested each time it runs the loop

            System.out.println("Loop " + i);
            i++; // This increments i by 1

        }
    }
}
