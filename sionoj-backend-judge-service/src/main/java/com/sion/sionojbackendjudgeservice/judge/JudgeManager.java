package com.sion.sionojbackendjudgeservice.judge;


import com.sion.sionojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.sion.sionojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.sion.sionojbackendjudgeservice.judge.strategy.JudgeContext;
import com.sion.sionojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.sion.sionojbackendmodel.model.codesandbox.JudgeInfo;
import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @Author : wick
 * @Date : 2024/11/1 11:13
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);

    }

}
