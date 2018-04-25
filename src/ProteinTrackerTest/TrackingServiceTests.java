package ProteinTrackerTest;


import static org.junit.Assert.*;

import org.junit.Test;

import com.simpleprogrammer.proteintracker.TrackingService;

public class TrackingServiceTests {
 @Test
 public void TotalZero(){
	 
	 TrackingService service = new TrackingService();
	 assertEquals("Tracking service total was not zero",0,service.getTotal());
 }
}
