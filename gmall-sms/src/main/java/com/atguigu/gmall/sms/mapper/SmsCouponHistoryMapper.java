package com.atguigu.gmall.sms.mapper;
import com.atguigu.gmall.sms.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
@Mapper
public interface SmsCouponHistoryMapper extends BaseMapper<SmsCouponHistoryEntity> {
	
}
