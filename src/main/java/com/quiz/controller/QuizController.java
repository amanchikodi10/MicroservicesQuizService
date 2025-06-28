package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entites.Quiz;
import com.quiz.service.QuizService;


@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	//create
	@Autowired
	private QuizService quizservice;
	
	@PostMapping("/create")
	public Quiz create(@RequestBody Quiz quiz) {
		return quizservice.add(quiz);
	}
	
	@GetMapping("/getall")
	public List<Quiz> getall(){
		return quizservice.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getbyid(@PathVariable Long id) {
		return quizservice.get(id);
	}
	

}
