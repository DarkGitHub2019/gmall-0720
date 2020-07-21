package com.atguigu.gmall.sms.mapper;
import com.atguigu.gmall.sms.entity.SmsSeckillSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
@Mapper
public interface SmsSeckillSkuMapper extends BaseMapper<SmsSeckillSkuEntity> {
	
}
