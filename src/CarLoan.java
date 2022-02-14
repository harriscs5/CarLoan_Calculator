//A program that will calculate the monthly car payment a user should expect to make after taking out a car loan.
public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        //this represents a loan length of 3 years
        int interestRate = 5;
        //Represents an interest rate of 5% on the loan
        int downPayment = 2000;
        //Represent the down payment provided by a user for this car purchase.

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            //method to calculate monthly payment
            int remainingBalance = carLoan - downPayment;
            int month = loanLength * 12;
            int monthlyBalance = remainingBalance / month;
            //monthly payment w/o interest
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);

        }
    }
}
