package com.zhixi;

import com.zhixi.mapper.DetoxCaptureTakeDrugsMapper;
import com.zhixi.pojo.DetoxCaptureTakeDrugs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OracleDemoApplicationTests {

    @Autowired
    private DetoxCaptureTakeDrugsMapper drugsMapper;

    @Test
    void contextLoads() {
        // 查询表中全部数据
        List<DetoxCaptureTakeDrugs> detoxCaptureTakeDrugs = drugsMapper.selectList(null);
        detoxCaptureTakeDrugs.forEach(System.out::println);
    }

    @Test
    public void test1() {
        System.out.println(drugsMapper.findAll());
    }


}
