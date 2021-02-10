package com.example.Qns1;

import java.sql.Time;
import java.util.List;

public class Train {
    String trainID;
    double travelSpeed;
    Junction finalDestination;
    List<Junction> travelRoute; // Contains list of junctions
    Track currentTrack;
    Track nextTrack;
    double currentPosition; // Distance from the start of currentTrack
    double distanceLeft; // Distance left to end of currentTrack
    // Qns 2
    String trainType;

    public double getDistanceLeft(Track currentTrack, double travelSpeed, double currentPosition){
        // gets the distance left to the end of the currentTrack
        return distanceLeft;
    }

    public void getCurrentTrack(){
        // gets the current track that the train is on
    }

    public void findNextTrack(){
        // Updates nextTrack based on travelRoute and currentPosition
    }

    public void updateParams(){
        // Updates the all the attributes
    }

    // Qns 2
    public void changeEngine(String trainType){
        // If train type is narrow gauge, changes engine when a junction point is reached
    }

}
