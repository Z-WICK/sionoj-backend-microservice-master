package com.sion.sionojbackendserviceclient.service;

import com.sion.sionojbackendmodel.model.entity.Question;
import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author wick
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2024-10-27 11:09:08
*/
@FeignClient(name = "sionoj-backend-question-service",path = "/api/question/inner")
public interface QuestionFeignClient{


   @GetMapping("/get/id")
   Question getQuestionById(@RequestParam("questionId") Long questionId);


   @GetMapping("/question_submit/get/id")
   QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") Long questionSubmitId);


   @PostMapping("/question_submit/update")
   boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);


}
