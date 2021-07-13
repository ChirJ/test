package com.yingkong.web;

import com.yingkong.core.service.SysAdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lin
 * @description
 * @time 2021/7/13 下午 1:40
 */
@SpringBootTest  //自动找启动 进行测试
public class TestMyApplication {

    @Autowired
    SysAdminService sysAdminService;

    // MAVEN 打包 需要跳过测试进行打包开发
    @Test
    public void testSpring(){
        System.out.println(sysAdminService.getAdminById(17));
    }
}
