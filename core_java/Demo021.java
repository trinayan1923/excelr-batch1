package core_java;
//TaxOnIncome
import java.util.Scanner;
public class Demo022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input monthly gross salary, HRA, and PF
        System.out.print("Enter monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter PF: ");
        double pf = scanner.nextDouble();

        // Calculate annual salary
        double annualSalary = monthlyGrossSalary * 12;

        // Calculate deductions
        double deductions = hra + pf;

        // Calculate taxable income
        double taxableIncome = annualSalary - deductions;

        // Calculate total tax
        double totalTax = calculateTax(taxableIncome);

        // Display the results
        System.out.printf("Annual Salary: %.2f%n", annualSalary);
        System.out.printf("Deductions: %.2f%n", deductions);
        System.out.printf("Taxable Income: %.2f%n", taxableIncome);
        System.out.printf("Total Tax: %.2f%n", totalTax);

        scanner.close();
    }

    public static double calculateTax(double taxableIncome) {
        double tax = 0;

        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10; // 10% tax
        } else if (taxableIncome <= 1000000) {
            tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20); // 10% on first 500000 and 20% on the rest
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30); // 10% on first 500000, 20% on next 500000, 30% on the rest
        }

        return tax;
    }
}

