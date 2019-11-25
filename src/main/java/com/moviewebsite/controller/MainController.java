package com.moviewebsite.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.moviewebsite.model.Movie;
import com.moviewebsite.service.MovieService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class MainController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		return movieService.findAll();
	}

	@GetMapping("/movies/{id}")
	public Movie getTitle(@PathVariable long id) {
		return movieService.findById(id);
	}

	@DeleteMapping("/movies/{id}/delete")
	public ResponseEntity<Void> deleteCourse(@PathVariable long id) {

		Movie movie = movieService.deleteById(id);

		if (movie != null) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping("/movies/{id}/update")
	public ResponseEntity<Movie> updateMovie(@PathVariable long id, @RequestBody Movie movie) {

		Movie movieUpdated = movieService.save(movie);

		return new ResponseEntity<Movie>(movie, HttpStatus.OK);
	}

	@PostMapping("/movies/new")
	public ResponseEntity<Void> createMovie(@RequestBody Movie movie) {

		Movie createdMovie = movieService.save(movie);

		// Location
		// Get current resource url
		/// {id}
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdMovie.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

}
