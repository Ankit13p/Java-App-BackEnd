package com.brainyfool.java.core.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.brainyfool.java.core.questions.model.Questions;

@Service
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

}
