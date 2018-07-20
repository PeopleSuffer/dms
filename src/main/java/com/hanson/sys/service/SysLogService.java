
package com.hanson.sys.service;


import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.hanson.core.util.PageUtils;
import com.hanson.sys.entity.SysLogEntity;


/**
 * 系统日志
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
