/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.tausicoach;

/**
 *
 * @author CARGOWELL
 */
public class Ttspentonjourney {
 public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        int speed = 250; // Speed in km/hr
        int refuelDistance = 200; // Distance after which train stops to refuel

        // Calculate the number of refuel stops
        int refuelStops = totalDistance / refuelDistance;

        // Calculate the travel time without stops
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Calculate total refuel stop time in hours
        double totalRefuelStopTime = (refuelStops * 5) / 60.0; // 5 minutes per stop

        // Calculate total travel time including stops
        double totalTravelTime = travelTimeWithoutStops + totalRefuelStopTime;

        // Print the results
        System.out.printf("Total time spent on the return journey: %.2f hours\n", totalTravelTime);
}
}    
