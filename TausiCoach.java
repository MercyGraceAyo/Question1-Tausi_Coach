/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.tausicoach;

/**
 *
 * @author CARGOWELL
 */
public class TausiCoach {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        int offloadLoadDistance = 150; // Distance after which train stops to offload/load
        int refuelDistance = 200; // Distance after which train stops to refuel

        // Calculate the number of stops for offloading/loading
        int offloadLoadStops = totalDistance / offloadLoadDistance;

        // Calculate the number of stops for refueling
        int refuelStops = totalDistance / refuelDistance;

        // Print the results
        System.out.println("Number of stops for offloading/loading: " + offloadLoadStops);
        System.out.println("Number of stops for refueling: " + refuelStops);
        }  
}
