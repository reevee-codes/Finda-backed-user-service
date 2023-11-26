package com.finda.service;

import com.finda.model.Questions;
import com.finda.model.User;
import com.finda.repository.QuestionsRepository;
import com.finda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionsRepository questionsRepository;



    // Create a new user
    public Questions createNewQuestions(Questions questions) {
        return questionsRepository.save(questions);
    }


//    // Create a new user
//    public User addQuestionsToTheUser(User user) {
//        return userRepository.save(user);
//    }

}
