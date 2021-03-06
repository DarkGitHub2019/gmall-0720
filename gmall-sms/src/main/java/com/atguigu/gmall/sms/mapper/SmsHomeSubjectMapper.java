package com.atguigu.gmall.sms.mapper;
import com.atguigu.gmall.sms.entity.SmsHomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
@Mapper
public interface SmsHomeSubjectMapper extends BaseMapper<SmsHomeSubjectEntity> {
	
}
