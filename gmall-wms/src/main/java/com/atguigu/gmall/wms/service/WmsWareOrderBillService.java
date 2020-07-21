package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsWareOrderBillEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 库存工作单
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:31:16
 */
public interface WmsWareOrderBillService extends IService<WmsWareOrderBillEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

