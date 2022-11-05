package Adventure2021.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileReader {
    private String txtFile = "src/main/resources/day2.txt";
    public List<String> movementList = new ArrayList<>();

    BufferedReader br;

    {
        try {
            br = new BufferedReader(new java.io.FileReader(txtFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public List<String> FileReader() throws IOException {
        try {
            String line = br.readLine();
            while (line != null){
                movementList.add(line);
                line = br.readLine();
            }
            return movementList;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }

    @Override
    public String toString() {
        return "FileReader{" +
                "movementList=" + movementList +
                '}';
    }
}
