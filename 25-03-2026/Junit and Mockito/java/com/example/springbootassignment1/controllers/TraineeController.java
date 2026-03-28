package com.example.springbootassignment1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootassignment1.entities.Trainee;
import com.example.springbootassignment1.services.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
	
	@Autowired
	TraineeService iTraineeRepository;
	
	@GetMapping
	List<Trainee> fetchAllTrainee() {
		return iTraineeRepository.getAllTrainees();
	}
	
	@GetMapping("/{id}")
	Trainee fetchTraineeByID(@PathVariable("id") int id) {
		return iTraineeRepository.getTraineeById(id);
	}
	
	@PostMapping
	Trainee insertTrainee(@RequestBody Trainee t) {
		return iTraineeRepository.insertTrainee(t);
	}
	@DeleteMapping("/{id}")
	Boolean deleteTrainee(@PathVariable("id") int id)
	{
		return iTraineeRepository.deleteTrainee(id);
	}

}