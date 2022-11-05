package Adventure2021.Day1;

import java.io.IOException;
import java.util.List;


public class Measurement {
    private final List<Integer> integers;
    private int counter = 0;
    private int threeCounter = 0;


    public Measurement() throws IOException {
        this.integers = new FileReader().FileReader();
    }

    public int measurementsResult(){
        for(int i = 1; i < integers.size(); i++){
            if(integers.get(i) > integers.get(i - 1)){
                counter++;
            }
        }
        return counter;
    }


    public int threeMeasurementsResult(){

        for(int i = 3; i < integers.size(); i++){
            int previousSum = integers.get(i-3) + integers.get(i-2) + integers.get(i-1);
            int nextSum = integers.get(i) + integers.get(i - 1) + integers.get(i -2);


            if(nextSum > previousSum){
                threeCounter++;
            }
        }
        return threeCounter;
    }
}
