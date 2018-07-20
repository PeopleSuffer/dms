
package com.hanson.sys.service;


import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.hanson.core.util.PageUtils;
import com.hanson.sys.entity.SysRoleEntity;


/**
 * 角色
 * 
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
