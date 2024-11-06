package com.sion.sionojbackendjudgeservice.judge.codesandbox;


import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {

     /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
