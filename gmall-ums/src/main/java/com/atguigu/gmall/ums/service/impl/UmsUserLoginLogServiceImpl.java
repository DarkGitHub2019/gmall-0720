package com.atguigu.gmall.ums.service.impl;

import com.atguigu.gmall.ums.entity.UmsUserLoginLogEntity;
import com.atguigu.gmall.ums.mapper.UmsUserLoginLogMapper;
import com.atguigu.gmall.ums.service.UmsUserLoginLogService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;



@Service("umsUserLoginLogService")
public class UmsUserLoginLogServiceImpl extends ServiceImpl<UmsUserLoginLogMapper, UmsUserLoginLogEntity> implements UmsUserLoginLogService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<UmsUserLoginLogEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<UmsUserLoginLogEntity>()
        );

        return new PageResultVo(page);
    }

}