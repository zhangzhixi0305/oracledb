package com.zhixi.mapper;

import com.zhixi.pojo.DetoxCaptureTakeDrugs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author zhixi
* @description 针对表【DETOX_CAPTURE_TAKE_DRUGS(吸毒人员案件表)】的数据库操作Mapper
* @createDate 2022-09-26 21:25:38
* @Entity com.zhixi.pojo.DetoxCaptureTakeDrugs
*/
@Repository
public interface DetoxCaptureTakeDrugsMapper extends BaseMapper<DetoxCaptureTakeDrugs> {
    @Select("select * from DETOX_CAPTURE_TAKE_DRUGS")
    List<DetoxCaptureTakeDrugs> findAll();
}




