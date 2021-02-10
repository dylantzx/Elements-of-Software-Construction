package com.example.Qns1;

import java.util.Arrays;
import java.util.List;

public class Junction {
    String junctionID;
    boolean checkOccupied;
    double x,y;
    List<Double> position = Arrays.asList(x,y);

    public boolean checkOccupied(){
        // returns True if occupied, otherwise False.
        return checkOccupied;
    }
    // Qns 2
    public void changeTrack(){
        // checks for trainType and changes the trackType accordingly
    }
}
