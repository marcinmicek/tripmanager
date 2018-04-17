package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testAddTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		assertEquals(0, tripManager.getTrips().size());
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
	}
	
	@Test
	public void testRemoveTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
		tripManager.removeTrip(trip);
		assertEquals(0, tripManager.getTrips().size());
	}
	
	@Test
	public void testFindTripByName() {	
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		tripManager.addTrip(trip);
		Trip trip1 = new Trip("Bieszczady", "góry");
		tripManager.addTrip(trip1);
		assertEquals(trip1, tripManager.findTrip("Bieszczady")); 
	}
	
	@Test
	public void testFindTripByDescription() {	
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		tripManager.addTrip(trip);
		Trip trip1 = new Trip("Bieszczady", "góry");
		tripManager.addTrip(trip1);
		assertEquals(trip, tripManager.findTrip("wakacje")); 
	}
	
	@Test
	public void testTripNotExists() {	
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		tripManager.addTrip(trip);
		Trip trip1 = new Trip("Bieszczady", "góry");
		tripManager.addTrip(trip1);
		assertEquals(null, tripManager.findTrip("morze"));
	}	
		
	@Test
	public void testFindTripByPhotoComment() {	
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Malta", "wakacje");
		Photo photo = new Photo("fotka z wakacji na Malcie");
		Photo photo1 = new Photo("La Valetta");
		trip.addPhoto(photo);
		trip.addPhoto(photo1);
		tripManager.addTrip(trip);
		Trip trip1 = new Trip("Bieszczady", "góry");
		Photo photo2 = new Photo("Tarnica");
		Photo photo3 = new Photo("Babia Góra");
		trip1.addPhoto(photo2);
		trip1.addPhoto(photo3);
		tripManager.addTrip(trip1);
		assertEquals(trip1, tripManager.findTrip("Babia Góra"));	
	} 
	
}	
