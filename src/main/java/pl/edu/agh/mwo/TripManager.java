package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	Collection<Trip> trips = new ArrayList<Trip>();
	Collection<Trip> foundTrips = new ArrayList<Trip>();
	
	public Collection<Trip> getTrips() {	
		return trips;
	}

	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public void removeTrip(Trip trip) {
		trips.remove(trip);
	}
	
	public void findTrip(String keyword) {
		for (Trip trip : trips) {
			if (trip.name.startsWith(keyword)) 
				foundTrips.add(trip);
		}
	}
	
}
