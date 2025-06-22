import java.util.HashMap;

public class FinancialForecastingMemoized {
    private static HashMap<Integer, Double> memo = new HashMap<>();

    public static double forecastFutureValue(double presentValue, double growthRate, int timePeriods) {
        if (timePeriods == 0) {
            return presentValue;
        }
        if (memo.containsKey(timePeriods)) {
            return memo.get(timePeriods);
        }
        double result = (1 + growthRate) * forecastFutureValue(presentValue, growthRate, timePeriods - 1);
        memo.put(timePeriods, result);
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 10000; // Initial investment
        double growthRate = 0.05;   // 5% annual growth
        int timePeriods = 5;       // 5 years

        double futureValue = forecastFutureValue(presentValue, growthRate, timePeriods);
        System.out.printf("Future Value after %d years: $%.2f%n", timePeriods, futureValue);
    }
}
