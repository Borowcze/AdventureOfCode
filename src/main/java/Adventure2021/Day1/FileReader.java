package Adventure2021.Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader  {
    private String txtFile = "src/main/resources/day1.txt";
    public List<Integer> integers = new ArrayList<>();

    BufferedReader br;

    {
        try {
            br = new BufferedReader(new java.io.FileReader(txtFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Integer> FileReader() throws IOException {
        try {
            String line = br.readLine();

            while (line != null){

                integers.add(Integer.parseInt(line));
                line = br.readLine();
            }
            return integers;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }
}
