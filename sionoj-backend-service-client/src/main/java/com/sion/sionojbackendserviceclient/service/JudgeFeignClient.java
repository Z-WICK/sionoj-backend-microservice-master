package com.sion.sionojbackendserviceclient.service;


import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sionoj-backend-judge-service",path = "/api/judge/inner")
public interface JudgeFeignClient {

    /**
     * 执行判题
     * @param questionSubmitId
     * @return {@link QuestionSubmit }
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);

}
