package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhotoTest {

	@Test
	public void testCreatePhoto() {	
		Photo photo = new Photo("fotka z wakacji na Malcie");
		assertEquals("fotka z wakacji na Malcie", photo.comment);	
	}
	
}
