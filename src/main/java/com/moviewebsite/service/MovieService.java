package com.moviewebsite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.moviewebsite.model.Movie;

@Service
public class MovieService {

	private static List<Movie> movies = new ArrayList<>();
	private static long idCounter = 0;

	static {
		movies.add(new Movie(++idCounter, "The Incredibles", 2004, "Action", "8/10", false, false, false, false, true));
		movies.add(new Movie(++idCounter, "Inception", 2010, "Sci-fi", "8/10", false, true, false, false, false));

	}

	public List<Movie> findAll() {
		return movies;
	}

	public Movie save(Movie movie) {
		if (movie.getId() == -1 || movie.getId() == 0) {
			movie.setId(++idCounter);
			movies.add(movie);
		} else {
			deleteById(movie.getId());
			movies.add(movie);
		}
		return movie;
	}

	public Movie deleteById(long id) {
		Movie movie = findById(id);

		if (movie == null)
			return null;

		if (movies.remove(movie)) {
			return movie;
		}

		return null;
	}

	public Movie findById(long id) {
		for (Movie movie : movies) {
			if (movie.getId() == id) {
				return movie;
			}
		}

		return null;
	}
}
