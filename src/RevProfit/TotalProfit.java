package RevProfit;

import java.util.Scanner;

public class TotalProfit {
    public static void main(String[]Args) {
        //Declare variables
        double Revenues;
        double Costs;
        double Profits;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total revenues \n");
        Revenues = sc.nextInt();
        System.out.print("Enter total costs \n");
        Costs = sc.nextInt();

        Profits = Revenues - Costs;

        System.out.println("Total profit is " + Profits);

    }
}
