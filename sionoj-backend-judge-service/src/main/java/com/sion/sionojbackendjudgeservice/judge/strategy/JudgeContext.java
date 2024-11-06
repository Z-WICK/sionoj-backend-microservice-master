package com.sion.sionojbackendjudgeservice.judge.strategy;


import com.sion.sionojbackendmodel.model.codesandbox.JudgeInfo;
import com.sion.sionojbackendmodel.model.dto.question.JudgeCase;
import com.sion.sionojbackendmodel.model.entity.Question;
import com.sion.sionojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @Author : wick
 * @Date : 2024/11/1 10:45
 * 上下文(用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
