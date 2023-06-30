package homework;


import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        convertMinutes();
    }


        public static void threeNames(){
            String firstName = "Sintia";
            String secondName = "Todorova";
            String thirdName = "Tsolova";

            //System.out.println(firstName + " " + secondName + " " + thirdName);
        }
        public static void trianglePerimeter() {
            double a = 3.5;
            double b = 4.5;
            double c = 5.5;

            double perimeter = a + b + c;
            System.out.println("The perimeter is: " + perimeter);
        }

        public static void triangleArea(){
            double a = 4.5;
            double h = 3.1;

            double area = (a * h) / 2;
            System.out.println("The area of the triangle is: " + area);
        }

        public static void asterisksTree() {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int spaces = n - 1;
            int stars = 1;

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < spaces; col++) {
                    System.out.print(" ");

                }
                for (int col = 0; col < stars; col++) {
                    System.out.print("* ");
                }
                System.out.println();
                stars++;
                spaces--;
            }
            for (int col = 0; col < n-1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        public static void trianglePerimeterInput(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter side a: ");
            double a = scanner.nextDouble();

            System.out.println("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.println("Enter side c: ");
            double c = scanner.nextDouble();

            double perimeter = a + b + c;
            System.out.println("The perimeter is: " + perimeter);
        }

        public static void triangleAreaInput(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter side a: ");
            double a = scanner.nextDouble();

            System.out.println("Enter side h:");
            double h = scanner.nextDouble();

            double area = (a * h) / 2;
            System.out.println("The area is: " + area);
        }

        public static void convertMinutes(){
            int minute = 60;
            int days = 24;
            int year = 365;

            int minutesIntoDays = minute * days;
            int minutesIntoYears = minute * days * year;
            System.out.println("Minutes into days: "+ minutesIntoDays);
            System.out.println("Minutes into year: " + minutesIntoYears);
        }
    }

