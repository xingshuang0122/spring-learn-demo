package com.github.xingshuangs.mybatis.plus.demo.service.impl;

import com.github.xingshuangs.mybatis.plus.demo.service.IRoleMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMenuServiceImplTest {

    @Autowired
    private IRoleMenuService roleMenuService;

    @Test
    public void queryMenuIdList() {
        List<Long> list = this.roleMenuService.queryMenuIdList(4L);
        list.forEach(System.out::println);
    }
}
