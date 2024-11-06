package com.sion.sionojbackendjudgeservice.judge.strategy;


import com.sion.sionojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return {@link JudgeInfo }
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
