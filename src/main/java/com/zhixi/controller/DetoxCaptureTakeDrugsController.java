package com.zhixi.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhixi.pojo.DetoxCaptureTakeDrugs;
import com.zhixi.service.DetoxCaptureTakeDrugsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DetoxCaptureTakeDrugsController
 * @Author zhangzhixi
 * @Description 用户访问
 * @Date 2022-10-12 12:42
 * @Version 1.0
 */
@Controller
@RequestMapping("/detoxCapture")
public class DetoxCaptureTakeDrugsController {

    @Resource
    private DetoxCaptureTakeDrugsService takeDrugsService;

    /**
     * 查询表中全部数据
     * @return 人员列表集合
     */
    @ResponseBody
    @GetMapping("/all")
    public List<DetoxCaptureTakeDrugs> getDetoxCaptAll() {
        BaseMapper<DetoxCaptureTakeDrugs> baseMapper = takeDrugsService.getBaseMapper();
        return baseMapper.selectList(null);
    }
}
