package com.sion.sionojbackendjudgeservice.judge.codesandbox.impl;


import com.sion.sionojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.sion.sionojbackendmodel.model.codesandbox.JudgeInfo;
import com.sion.sionojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.sion.sionojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * @Author : wick
 * @Date : 2024/10/30 19:36
 * 示例代码沙箱（仅为了跑通业务流程）
 */

public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试用例成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;

    }
}
