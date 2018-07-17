package com.BandApp.BandApp;

import java.util.List;

public interface BandDao {

	void newBand(Band band);


	List<Band> getBandProfile(String userName);

}
