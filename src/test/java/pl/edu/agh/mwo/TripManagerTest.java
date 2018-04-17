package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testAddTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip();
		assertEquals(0, tripManager.getTrips().size());
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
	}
	
	@Test
	public void testRemoveTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
		tripManager.removeTrip(trip);
		assertEquals(0, tripManager.getTrips().size());
	}
	
	@Test
	public void testfindTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		String keyword = "ala";
		trip.name = keyword;
		tripManager.findTrip(keyword);
		assertEquals(1, tripManager.foundTrips.size());
	}
}
