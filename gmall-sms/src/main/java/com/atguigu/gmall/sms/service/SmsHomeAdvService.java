package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SmsHomeAdvEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdvEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

