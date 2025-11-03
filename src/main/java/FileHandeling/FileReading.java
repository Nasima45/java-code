package FileHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name which you want to read : ");
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading content ");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found ," + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
