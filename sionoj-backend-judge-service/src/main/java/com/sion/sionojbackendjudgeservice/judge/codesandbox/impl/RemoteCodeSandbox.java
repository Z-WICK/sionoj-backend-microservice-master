package com.sion.sionojbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.sion.sionojbackendcommon.common.ErrorCode;
import com.sion.sionojbackendcommon.exception.BusinessException;
import com.sion.sionojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.sion.sionojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * @Author : wick
 * @Date : 2024/10/30 19:36
 * 远程代码沙箱（实际调用接口的沙箱）
 */

public class RemoteCodeSandbox implements CodeSandbox {
    // 定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();

        if (StrUtil.isBlank(responseStr)){
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR,"executeCode remoteSandbox error, message =" + responseStr);
        }
        return JSONUtil.toBean(responseStr,ExecuteCodeResponse.class);

    }
}
