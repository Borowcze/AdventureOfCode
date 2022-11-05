package Adventure2021.Day2;

import java.io.IOException;
import java.util.*;

public class SubmarineMovement {
    private final List<String> movements;
    private int depth = 0;
    private int forward = 0;
    private int aim = 0;


    public SubmarineMovement() throws IOException {
        this.movements = new FileReader().FileReader();
    }

    public int horizontalPosition(){
        for (String movement:movements) {
            String[] movementSplit = splitInput(movement);

            switch (movementSplit[0]){
                case "forward":
                    forward += Integer.parseInt(movementSplit[1]);
                    break;
                case "down":
                    depth += Integer.parseInt(movementSplit[1]);
                    break;
                case "up":
                    depth -= Integer.parseInt(movementSplit[1]);
            }
        }

        return depth * forward;
    }

    public int horizontalPositionWithAim(){
        for (String movement:movements) {
            String[] movementSplit = splitInput(movement);

            switch (movementSplit[0]){
                case "forward":
                    forward += Integer.parseInt(movementSplit[1]);
                    depth += aim*Integer.parseInt(movementSplit[1]);
                    break;
                case "down":
                    aim += Integer.parseInt(movementSplit[1]);
                    break;
                case "up":
                    aim -= Integer.parseInt(movementSplit[1]);
                    break;
            }
        }

        return depth * forward;
    }

    private String[] splitInput(String input){
        String[] split = input.split(" ");
        return split;
    }
}
