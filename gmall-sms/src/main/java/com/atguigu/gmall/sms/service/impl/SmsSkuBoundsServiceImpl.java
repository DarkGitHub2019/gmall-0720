package com.atguigu.gmall.sms.service.impl;
import com.atguigu.gmall.sms.entity.SmsSkuBoundsEntity;
import com.atguigu.gmall.sms.mapper.SmsSkuBoundsMapper;
import com.atguigu.gmall.sms.service.SmsSkuBoundsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


@Service("smsSkuBoundsService")
public class SmsSkuBoundsServiceImpl extends ServiceImpl<SmsSkuBoundsMapper, SmsSkuBoundsEntity> implements SmsSkuBoundsService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SmsSkuBoundsEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SmsSkuBoundsEntity>()
        );

        return new PageResultVo(page);
    }

}