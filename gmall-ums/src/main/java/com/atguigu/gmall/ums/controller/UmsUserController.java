package com.atguigu.gmall.ums.controller;

import java.util.List;

import com.atguigu.gmall.ums.entity.UmsUserEntity;
import com.atguigu.gmall.ums.service.UmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.common.bean.PageParamVo;

/**
 * 用户表
 *
 * @author dark
 * @email dark@163.com
 * @date 2020-07-21 09:29:13
 */
@Api(tags = "用户表 管理")
@RestController
@RequestMapping("ums     #ä¿®æ¹/umsuser")
public class UmsUserController {

    @Autowired
    private UmsUserService umsUserService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> queryUmsUserByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = umsUserService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<UmsUserEntity> queryUmsUserById(@PathVariable("id") Long id){
		UmsUserEntity umsUser = umsUserService.getById(id);

        return ResponseVo.ok(umsUser);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody UmsUserEntity umsUser){
		umsUserService.save(umsUser);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody UmsUserEntity umsUser){
		umsUserService.updateById(umsUser);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		umsUserService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
