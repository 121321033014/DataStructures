package org.example.IndiGo;

import java.util.HashMap;

public class FlightManager {
    public static void main(String[] args) {
        HashMap<String,FLightdetails> f=new HashMap<>();
        FLightdetails detalis1=new FLightdetails("6E5393","Mumbai","Hyderabad","06NOV23","21:50");
        FLightdetails detalis2=new FLightdetails("6E5397","goa","Hyderabad","07NOV23","10:50");
              f.put(detalis1.getFlightid(),detalis1);
              f.put(detalis2.getFlightid(),detalis2);
              String desiredFlightid="6E5393";
              if(f.containsKey(desiredFlightid)){
                  FLightdetails desiredFlight=f.get(desiredFlightid);
                  System.out.println("Flight details for "+desiredFlightid+" is "+desiredFlight);

              }
              else{
                  System.out.println("Flight details with id "+desiredFlightid+" is "+" not found");
              }
    }
}
