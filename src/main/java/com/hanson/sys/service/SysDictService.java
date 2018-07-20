
package com.hanson.sys.service;

import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.hanson.core.util.PageUtils;
import com.hanson.sys.entity.SysDictEntity;

/**
 * 数据字典
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

