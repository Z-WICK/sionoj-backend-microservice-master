package com.sion.sionojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @Author : wick
 * @Date : 2024/10/27 12:07
 */
@Data
public class JudgeConfig {

    /**
    * 时间限制(ms)
    * */
    private Long timeLimit;

    /**
    * 内存限制(kb)
    * */
    private Long memoryLimit;

    /**
    *堆栈限制(kb)
    * */
    private Long stackLimit;
}
