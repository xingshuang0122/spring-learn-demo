package com.github.xingshuangs.mybatis.plus.demo.service.impl;

import com.github.xingshuangs.mybatis.plus.demo.entity.Menu;
import com.github.xingshuangs.mybatis.plus.demo.mapper.MenuMapper;
import com.github.xingshuangs.mybatis.plus.demo.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author xingshuang
 * @since 2019-11-09
 */
@Slf4j
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
