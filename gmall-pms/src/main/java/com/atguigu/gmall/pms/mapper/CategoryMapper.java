package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dark
 * @email dark@163.com
 * @date 2020-07-20 17:21:25
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
