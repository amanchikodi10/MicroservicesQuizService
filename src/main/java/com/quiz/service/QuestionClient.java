package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entites.Question;

@FeignClient(url="http://localhost:8082",value="Question-Client")
public interface QuestionClient {
	
	@GetMapping("/question/getbyQuizId/{quizId}")
	List<Question> getQuestionofQuiz(@PathVariable Long quizId);

	@GetMapping("/question/getall")
	List<Question> getQuestionAnsAnswerofQuiz();

}
