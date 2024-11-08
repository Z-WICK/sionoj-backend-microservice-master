package com.sion.sionojbackendjudgeservice.judge;


import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 执行判题
     * @param questionSubmitId
     * @return {@link QuestionSubmit }
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
