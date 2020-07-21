package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SmsHomeSubjectEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:35:10
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubjectEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

