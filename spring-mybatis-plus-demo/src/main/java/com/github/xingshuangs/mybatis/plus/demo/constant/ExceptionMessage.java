/*
  Copyright (C), 2009-2019, 江苏汇博机器人技术股份有限公司
  FileName: ExceptionMessage
  Author:   xingshuang
  Date:     2019/11/10
  Description:
  History:
  <author>          <time>          <version>          <desc>
  作者姓名           修改时间           版本号              描述
 */

package com.github.xingshuangs.mybatis.plus.demo.constant;


/**
 * @author xingshuang
 * @date 2019/11/10
 */
public class ExceptionMessage {

    private ExceptionMessage() {
    }

    public static final String INVALID_PARAM = "非法参数";
    public static final String NULL_POINT = "空指针";
    public static final String COUNT_ZERO = "个数为0";
    public static final String USERNAME_EXIST = "用户名已存在";
    public static final String RECORD_EXIST = "数据库中唯一标识的数据重复";
    public static final String NOT_FOUND = "未查询到数据";

}