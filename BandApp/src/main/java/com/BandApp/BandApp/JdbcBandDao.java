package com.BandApp.BandApp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcBandDao implements BandDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcBandDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void newBand(Band band) {
		String sqlInsertReview = "INSERT INTO BandApp(band_name, genre_one, genre_two, genre_three, influence_one, influence_two, influence_three, influence_four, influence_five, biography, band_picture, song_one, song_two, song_three) "
				+ "					   VALUES (			?,			?,			?,			?,			?,				?,				?,				?,				?,				?,			?,			?,		?,			?) RETURNING band_id";

		long id = jdbcTemplate.queryForObject(sqlInsertReview, Long.class, band.getBandName(), band.getGenreOne(), band.getGenreTwo(), band.getGenreThree(), 
				band.getInfluenceOne(), band.getInfluenceTwo(), band.getInfluenceThree(), band.getInfluenceFour(), band.getInfluenceFive(), 
				band.getBiography(), band.getBandPic(), band.getSongOne(), band.getSongTwo(), band.getSongthree());
		band.setId(id);
	}

}
