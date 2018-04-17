package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripTest {

	@Test
	public void testAddPhoto() {
		Trip trip = new Trip("Malta", "wakacje");
		Photo photo = new Photo("Fotka z wakacji na Malcie");
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	
	@Test
	public void testCreateTrip() {	
		Trip trip = new Trip("Malta", "wakacje");
		assertEquals("Malta", trip.name);	
		assertEquals("wakacje", trip.description);	
}

}
