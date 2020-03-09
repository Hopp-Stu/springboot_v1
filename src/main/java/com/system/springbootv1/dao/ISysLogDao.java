package com.system.springbootv1.dao;

import com.system.springbootv1.model.SysLog;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: yy 2020/01/27
 **/
public interface ISysLogDao {
    int insert(SysLog sysLog);
    List<SysLog> list(Map<String,Object> params);
}
