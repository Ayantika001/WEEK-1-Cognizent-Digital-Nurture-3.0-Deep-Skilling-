/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financial.forecasting;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AYANTIKA
 */
public class FinancialForecasting2 {

    private static Map<Integer, Double> memo = new HashMap<>();

    // Method to calculate future value using recursion with memoization
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: no more years to forecast
        if (years == 0) {
            return presentValue;
        }
        // Check if the result is already computed
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        // Recursive case: calculate the future value for the next year
        double futureValue = calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        memo.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Example present value
        double growthRate = 0.05; // Example annual growth rate (5%)
        int years = 10; // Number of years into the future

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}
