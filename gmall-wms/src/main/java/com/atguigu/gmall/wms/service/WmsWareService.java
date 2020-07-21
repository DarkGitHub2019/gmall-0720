package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WmsWareEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 仓库信息
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:31:16
 */
public interface WmsWareService extends IService<WmsWareEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

