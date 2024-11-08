package com.ysy.mianshiya.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量从题库移除题目关联请求
 *
 * @author : yangshiyu
 * @date: 2024/11/7 - 11 - 07 - 16:21
 * @Description: com.ysy.mianshiya.model.dto.questionBankQuestion
 * @version: 1.0
 */
@Data
public class QuestionBankQuestionBatchRemoveRequest implements Serializable {

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}