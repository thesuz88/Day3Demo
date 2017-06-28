/**
 * Created by Steve on 6/28/2017.
 * using a do-while loop to calculate payment on leased vehicle
 */
public class DoWhileLoopEx {
    public static void main(String[] args) {

        int i = 1; // this is our counter
        int month = 36; //initialized to the number of months you are making payments
        double futureValue = 0;
        double monthlyPmt = 330.63;
        double interestRate = 5.99 / 100;

        do {
            futureValue = (futureValue + monthlyPmt) * (1 + interestRate);
            i++;
        } while (i <= month);

        System.out.println("The amount of money you spent is: " + futureValue);
    }
}
