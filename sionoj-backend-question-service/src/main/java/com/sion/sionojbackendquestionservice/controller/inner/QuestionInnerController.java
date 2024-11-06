package com.sion.sionojbackendquestionservice.controller.inner;

import com.sion.sionojbackendmodel.model.entity.Question;
import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;
import com.sion.sionojbackendquestionservice.service.QuestionService;
import com.sion.sionojbackendquestionservice.service.QuestionSubmitService;
import com.sion.sionojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author : wick
 * @Date : 2024/11/6 16:32
 * 改服务仅仅内部调用,不给前端
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    QuestionSubmitService questionSubmitService;


    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") Long questionId) {
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") Long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}
