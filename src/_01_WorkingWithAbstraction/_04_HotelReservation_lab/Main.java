package _01_WorkingWithAbstraction._04_HotelReservation_lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.parse(input[2]);
        Discount discount = Discount.parse(input[3]);


        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, days,season,discount);

        System.out.printf("%.2f%n",priceCalculator.calculatePrice());
    }
}
