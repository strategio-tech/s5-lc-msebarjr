package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * <p>This method will calculate the remaining amount owed on a loan after 3 months of payments</p>
     * 
     * @param amount the loan amount taken out
     * @return the remaining amount of the loan after 3 months of payments
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        float paymentPercentage = .10f;

        for (int x = 0; x <= 2; x++ ) {
            amount -=  (int)(amount * paymentPercentage);
        }

        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
