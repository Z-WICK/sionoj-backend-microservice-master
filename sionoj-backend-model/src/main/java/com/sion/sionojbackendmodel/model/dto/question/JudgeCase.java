package com.sion.sionojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @Author : wick
 * @Date : 2024/10/27 12:02
 */
@Data
public class JudgeCase {

    /**
    * 输入用例
    * */
    private String input;

     /**
    * 输出用例
    * */
    private String output;
}
