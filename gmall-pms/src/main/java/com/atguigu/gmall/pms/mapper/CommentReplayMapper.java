package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author dark
 * @email dark@163.com
 * @date 2020-07-20 17:21:25
 */
@Mapper
public interface CommentReplayMapper extends BaseMapper<CommentReplayEntity> {
	
}
