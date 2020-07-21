package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsPurchaseDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:31:16
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

