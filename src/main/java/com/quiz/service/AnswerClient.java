package com.quiz.service;

import com.quiz.entites.Answer;
import com.quiz.entites.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url="http://localhost:8086",value="ANSWER-SERVICE")
public interface AnswerClient {

    @GetMapping("/answer/getByquestionId/{id}")
    List<Answer> getQuestionAnsAnswerofQuiz(@PathVariable Long id);
}
