import org.junit.jupiter.api.Test;

import java.io.*;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {
      //write here second task
        try {
            File file = new File("traineeTestTask/src/test/resources/ReadFileTests.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(filereader);
            String text = reader.readLine();

            while (text.equals("аллоха")) {
                System.out.println(text);
            }
        } finally {
            
        }

    }
    }
