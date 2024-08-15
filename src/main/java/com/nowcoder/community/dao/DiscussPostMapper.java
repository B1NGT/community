package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //根据userid筛选帖子，userid=0时表示所有id，offset表示每一页起始行行号，limit表示每页最多多少数据
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    //查询帖子行数，Param注解用于给参数取别名
    //如果方法只有一个参数，并且在<if>里使用，必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

    //发布帖子
    int insertDiscussPost(DiscussPost discussPost);

    //查询帖子详情
    DiscussPost selectDiscussPostById(int id);
}
