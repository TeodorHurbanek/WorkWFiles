import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static void writePersonToFile(String pathFile, Person person) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(pathFile, true)
        )){
            bufferedWriter.append(String.valueOf(person));
            bufferedWriter.newLine();
        }
    }
}
