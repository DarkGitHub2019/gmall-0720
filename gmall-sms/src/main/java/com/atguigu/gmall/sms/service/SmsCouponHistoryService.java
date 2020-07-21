package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

