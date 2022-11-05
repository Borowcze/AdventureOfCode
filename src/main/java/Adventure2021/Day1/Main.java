package Adventure2021.Day1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Measurement measurement = new Measurement();

        System.out.println(measurement.measurementsResult());
        System.out.println(measurement.threeMeasurementsResult());
    }
}
