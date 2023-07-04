package homework.fixcode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixThisCode {

        private static FileWriter getFileWriter(String filePath) {
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                return fileWriter;
            } catch (IOException e) {
                System.out.println("An error occurred while creating FileWriter: " + e.getMessage());
                return null;
            }
        }

        protected static void closeFileWriter(FileWriter fileWriter) {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing FileWriter: " + e.getMessage());
            }
        }

        public static void printToFile(FileWriter fileWriter, String text, int repeat) {
            try {
                for (int i = 0; i < repeat; i++) {
                    fileWriter.write(text + "\n");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.next();
            int howManyTimesToPrintTheTextToFile = scanner.nextInt();
            String textToAdd = scanner.next();

            FileWriter fileWriter = null;
            try {
                fileWriter = getFileWriter(filePath);
                if (fileWriter != null) {
                    printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
                }
            } finally {
                closeFileWriter(fileWriter);
            }
        }
}
