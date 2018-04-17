package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	Collection<Trip> trips = new ArrayList<Trip>();
	
	public Collection<Trip> getTrips() {	
		return trips;
	}

	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public void removeTrip(Trip trip) {
		trips.remove(trip);
	}
	
	public Trip findTrip(String keyword) {
		for (Trip trip : trips) {
			if (trip.name.equals(keyword) || trip.description.equals(keyword)) {
				return trip;
			} else {
				Collection<Photo> myPhotos = trip.getPhotos();				
				for(Photo photo: myPhotos) {
					if (photo.comment == keyword) {
						return trip;
					}
				}
			}
		}
		return null;
	}
	
}
