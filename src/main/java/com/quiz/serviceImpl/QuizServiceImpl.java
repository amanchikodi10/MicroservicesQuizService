package com.quiz.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import com.quiz.entites.Question;
import com.quiz.service.AnswerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entites.Quiz;
import com.quiz.repo.QuizRepository;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizrepo;
	
	@Autowired
	private QuestionClient questionclient;

	@Autowired
	private AnswerClient answerClient;
	

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizrepo.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> allquiz= quizrepo.findAll();
		allquiz.stream().map( quiz->{
			quiz.setQuestion(questionclient.getQuestionofQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return allquiz;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quizbyid= quizrepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
		quizbyid.setQuestion(questionclient.getQuestionofQuiz(id));
		return quizbyid;
	}

	@Override
	public Quiz getQuestionAnswerByquizId(long id){
		Quiz quizbyid=quizrepo.findById(id).get();
		List<Question> listQuestions=questionclient.getQuestionAnsAnswerofQuiz();
		quizbyid.setQuestion(listQuestions.stream().toList());
		for( Question qu: listQuestions)
		{
			qu.setAnswer(answerClient.getQuestionAnsAnswerofQuiz(qu.getQuestionId()));
		}
		return quizbyid;
	}

}
