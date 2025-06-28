package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entites.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
