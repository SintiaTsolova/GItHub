package homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        vacationBudget();
    }

    public static void weekDays() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("The " + n + "-st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + n + "-nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + n + "-rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + n + "-th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + n + "-th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + n + "-th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + n + "-th day of the week is Sunday.");
        }
    }

    public static void eligibleAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n = scanner.nextInt();

        if (n <= 16) {
            System.out.println("You are not eligible to work!");
        } else {
            System.out.println("You are eligible to work.");
        }
    }

    public static void revenueSale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity: ");
        double quantity = scanner.nextDouble();
        double total = quantity * unitPrice;
        double discount = 0;
        double result = 0;
        String percentage = "";

        if (quantity >= 100 && quantity <= 120) {
            discount = total * 0.15;
            result = total - discount;
            percentage = "(15.0%)";
        } else if (quantity > 120) {
            discount = total * 0.20;
            result = total - discount;
            percentage = "(20.0%)";
        }
        System.out.println("The revenue sale is: " + result +"$");
        System.out.println("Discount: " + discount +"$" + percentage);
    }

    public static void largestNumber() {
        int[] array = {4, 14, 58, 34};

        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("The largest number is: " + maxNumber);
    }

    public static void vacationBudget() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter type of vacation: ");
        String vacation = scanner.next();

        System.out.println("Enter budget: ");
        int budget = scanner.nextInt();

        switch (vacation){
            case "Beach":
                if (budget <= 49){
                    System.out.println("A better destination for your budget would be Bulgaria.");
                }
                else if(budget > 50) {
                    System.out.println("Searching for destinations...");
                }
                break;
            case "Mountain":
                if (budget <= 29){
                    System.out.println("A better destination for your budget would be Bulgaria.");
                }
                else if(budget > 30) {
                    System.out.println("Searching for destinations...");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
        }
    }

    public static void divideNumbers(){
        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int n;

        for (int i = 0; i < array.length; i++) {
            n = array[i];
            if (n > 149){
                break;
            }
            if (n % 5 == 0){
                System.out.println(n);
            }
        }
    }
    public static void reverseLoop(){
        int[] array = {10, 20, 30, 40, 50};

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}

