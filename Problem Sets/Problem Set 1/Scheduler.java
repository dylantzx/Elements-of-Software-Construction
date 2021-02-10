package com.example.Qns1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Scheduler {
    // Contains a list of all the trains
    List<Train> allTrains;
    String reason;
    // Linked list to store potential collisions
    List<List<String>> potentialCollisionList = new LinkedList<>();

    public void updateByTime(){
        // use moveTrain() method to move all trains
        // uses getUpdates() and checkPotentialCollision() method every few seconds
        // use trainPriority() method to schedule train.
        // invoke changeTrack() method to change tracks at the junctions as required by the trains
    }
    public void getUpdates(){
        // The method loops through all the Trains in the allTrains list
        // Invokes the UpdateParams() method in Train class
    }
    public void checkPotentialCollision(){
        // Check for potential collisions based on speed, next track and immediate destination
        // if next trackIDs for 2 trains are the same, add to collision list
        // if immediate destination for 2 trains are the same and distance left for at least
        // one train is lower than a specified amount, add to collision list
        // Appends a List containing both potentially colliding trainIDs with the reason,
        // to the potentialCollisionList.
        // If reason is due to immediate destination being the same,
        // append the train that is closer first
    }
    public void stopTrain(){
        // Sends a signal to top moving the train as soon as possible
    }
    public void moveTrain(){
        // Sends signal to move the train
    }
    public void trainPriority(){
        // For each potential collision in the potentialCollisionList,
        // Check for the reason for potential collision.
        // if reason is due to same next track,
        // randomly assign a train to stop and a train to move, using the stopTrain() or moveTrain() methods
        // if reason is due to immediate destination being the same,
        // use stopTrain() method to stop the 2nd train.
    }
}
