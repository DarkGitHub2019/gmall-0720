package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsPurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 采购信息
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:31:16
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

