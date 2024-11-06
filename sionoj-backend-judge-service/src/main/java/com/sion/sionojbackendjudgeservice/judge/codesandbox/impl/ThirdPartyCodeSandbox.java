package com.sion.sionojbackendjudgeservice.judge.codesandbox.impl;


import com.sion.sionojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @Author : wick
 * @Date : 2024/10/30 19:36
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */

public class ThirdPartyCodeSandbox implements CodeSandbox {


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
