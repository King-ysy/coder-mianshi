package com.ysy.mianshiya.mapper;

import com.ysy.mianshiya.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author yangshiyu
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-10-25 15:52:48
* @Entity com.ysy.mianshiya.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    /**
     * 查询题目列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}





