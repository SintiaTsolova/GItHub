package homework;

import java.util.Scanner;

public class homework4 {public static void main(String[] args) {
    //isEven
    // Scanner scanner = new Scanner(System.in);
    //int n = scanner.nextInt();

    // if (n % 2 == 0){
    // System.out.println(true);
    // }
    // else {
    // System.out.println(false);
    //  }

    //palindromeNumber
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int reverse = 0;
    int a = num;

    while (num > 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num /= 10;
    }

    if (a == reverse){
        System.out.println(true);
    }else {
        System.out.println(false);
    }

}

    public static int smallestNumber(int[] array){

        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]){
                minNumber = array[i];
            }
        }
        System.out.println("The smallest number is: " + minNumber);
        return minNumber;
    }

    public static void averageNumber(){
        int [] array = {23, 12, 7};

        int average = array[0];
        int count = array.length;
        for (int i = 1; i < array.length; i++) {
            average += array[i];
        }
        System.out.println("The average is: " + (average / count));
    }

    public static void middleCharacter(){
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int middle = 0;

        for (int i = 1; i < word.length(); i++) {
            middle = word.length() / 2;
        }
        System.out.println("The middle character is: " + word.charAt(middle));
    }

    public static int isEven(int n){
        return n;
    }

    public static int palindromeNumber(int num){
        return num;
    }
}

