package pl.edu.agh.mwo;
import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	
	//public String name;
	//public String description;
	
	Collection<Photo> photos = new ArrayList<Photo>();
	
	public Collection<Photo> getPhotos() {
		// TODO Auto-generated method stub
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}


}