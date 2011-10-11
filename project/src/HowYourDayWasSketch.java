import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import processing.core.PApplet;
import edu.umich.eecs498f11.howyourdaywas.DataPoint;
import edu.umich.eecs498f11.howyourdaywas.DataPointComparator;
import edu.umich.eecs498f11.howyourdaywas.DataSource;
import edu.umich.eecs498f11.howyourdaywas.FacebookSource;
import edu.umich.eecs498f11.howyourdaywas.TwitterSource;

public class HowYourDayWasSketch extends PApplet {

	private static final long serialVersionUID = -450426086211320391L;

	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", "HowYourDayWasSketch" });
	}

	public void setup() {
		// TODO
		// for display, we'll likely steal a lot of the fonts and full-screen stuff from cdzombak's NoiseSketch (in processing-exercises)
		
		// Example Twitter usage:
		final DataSource twitter = new TwitterSource();
		final DataSource facebook = new FacebookSource();
		final List<DataPoint> tweets = twitter.getData();
		final List<DataPoint> statuses = facebook.getData();
		final List<DataPoint> collection = facebook.getData();
		collection.addAll(tweets);
		DataPointComparator c = new DataPointComparator();
		Collections.sort(collection, c);
		
		for(final DataPoint message : collection) {
			System.out.println(message.text);
		}
		
	}
	
	public void draw() {
		// TODO
	}
	
}
