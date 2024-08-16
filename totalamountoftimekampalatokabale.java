/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.tausicoach;

/**
 *
 * @author CARGOWELL
 */
public class totalamountoftimekampalatokabale {
  public static void main(String[] args){
    int totalDistance = 10000; // Total distance in km
        int speed = 250; // Speed in km/hr
        int stopTime = 5; // Time taken per stop in minutes

        // Calculate the number of stops
        int offloadLoadStops = totalDistance / 150;
        int refuelStops = totalDistance / 200;
        int totalStops = offloadLoadStops + refuelStops;

        // Calculate the time taken for the journey without stops
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Calculate total stop time in hours
        double totalStopTime = (totalStops * stopTime) / 60.0;

        // Calculate total travel time including stops
        double totalTravelTime = travelTimeWithoutStops + totalStopTime;

        // Print the results
        System.out.printf("Total time taken including stops: %.2f hours\n", totalTravelTime);
}

}   
