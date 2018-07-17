package com.BandApp.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.BandApp.BandApp.Band;
import com.BandApp.BandApp.BandDao;

@Controller
public class HomePageController {
	
	@Autowired
	private BandDao bandDao;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showLoginForm() {
		return "homePage";
	}
	
	@RequestMapping(path="/", method=RequestMethod.POST)
    public String postNewReview(@RequestParam String name, @RequestParam String genreOne, 
    								@RequestParam String influenceOne, @RequestParam String biography,
    								@RequestParam String bandPicPath) {
		Band newBand = new Band();
		newBand.setBandName(name);
		newBand.setGenreOne(genreOne);
		newBand.setInfluenceOne(influenceOne);
		newBand.setBiography(biography);
		newBand.setBandPic(bandPicPath);
		
		bandDao.newBand(newBand);
		
    		return "redirect:/";
	}

}
