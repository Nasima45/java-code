package FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    static void main() {
        String fileName = "java-code.txt";
        try (FileWriter file = new FileWriter(fileName)) {

            file.write("i am kuhu\n");
            for (int i = 0; i < 10; i++) {
                file.write('x');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
