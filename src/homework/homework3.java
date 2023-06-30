package homework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class homework3 {public static void main(String[] args) {
    diagonalSum();
}

    public static void sumArray() {
        int[] array = {2, 35, 26, 12, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    public static void matrix() {
        int[][] array = new int[3][4];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixInput() {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];


        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void biggestNumber() {
        int[] array = {5, 2, 23, 12, 19};

        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }
        System.out.println("The biggest element is: " + num);
    }

    public static void tryOut() {
        LinkedList<String> list = new LinkedList<>();

        list.add("KTM");
        list.add("Beta");
        list.add("Honda");
        list.add("Husqvarna");
        list.add("Yamaha");
        list.add(2, "GasGas");
        System.out.println(list);

        list.remove("Yamaha");
        list.remove(3);
        System.out.println(list);
    }

    public static void reverseLinkedList() {

        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }

    public static void diagonalSum() {
        int[][] array = new int[4][4];
        int sum = 0;

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;
        array[3][0] = 13;
        array[3][1] = 14;
        array[3][2] = 15;
        array[3][3] = 16;

        System.out.println("2d matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
                if (i == j){
                    sum = sum + array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The sum of the diagonal is: " + sum);
    }

    public static void palindrome(){
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String reverseWord = "";

        for (int i = (word.length() - 1); i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        if (word.toLowerCase().equals(reverseWord.toLowerCase())){
            System.out.println(word + " is a Palindrome String.");
        }
        else {
            System.out.println(word + " is not a Palindrome String.");
        }
    }
}

