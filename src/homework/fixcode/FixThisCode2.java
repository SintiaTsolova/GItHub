package homework.fixcode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixThisCode2 {
    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.next();
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        String textToAdd = scanner.next();

        FileWriter fileWriter = getFileWriter(filePath);
        printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        closeFileWriter(fileWriter);
    }
}
