public class App {
    public static void main(String[] args) throws Exception {
        // Initialize variables
        double tuition = 10000;  
        double annualIncreaseRate = 0.05;  
        int years = 10;  

        // Calculate the tuition after 10 years
        double tuitionAfterTenYears = tuition;
        for (int i = 1; i <= years; i++) {
            tuitionAfterTenYears += tuitionAfterTenYears * annualIncreaseRate;  
        }

        // Calculate the total cost of four years of tuition starting from year 11
        double totalCostOfFourYears = 0;
        double currentTuition = tuitionAfterTenYears;
        for (int i = 0; i < 4; i++) {
            totalCostOfFourYears += currentTuition;  
            currentTuition += currentTuition * annualIncreaseRate;  
        }

        // Output
        System.out.println("Tuition after 10 years: $" + String.format("%.2f", tuitionAfterTenYears));
        System.out.println("Total cost of four years' worth of tuition after the 10th year: $" + String.format("%.2f", totalCostOfFourYears));
    }
}
