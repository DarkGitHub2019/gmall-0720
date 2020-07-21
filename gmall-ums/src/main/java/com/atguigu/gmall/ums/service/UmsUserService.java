package com.atguigu.gmall.ums.service;
import com.atguigu.gmall.ums.entity.UmsUserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * 用户表
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:29:13
 */
public interface UmsUserService extends IService<UmsUserEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

