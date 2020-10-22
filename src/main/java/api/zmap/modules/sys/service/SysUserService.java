/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import api.zmap.common.utils.PageUtils;
import api.zmap.modules.sys.entity.SysUserEntity;

import java.util.Map;


/**
 * 系统用户
 *
 * @author lewkace@gmail.com
 */
public interface SysUserService extends IService<SysUserEntity> {

	PageUtils queryPage(Map<String, Object> params);

	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);

    Long queryUserIdByName(String username);

	/**
	 * 保存用户
	 */
	void saveUser(SysUserEntity user);
	
	/**
	 * 修改用户
	 */
	void update(SysUserEntity user);
	
	/**
	 * 删除用户
	 */
	void deleteBatch(Long[] userIds);

	/**
	 * 修改密码
	 * @param userId       用户ID
	 * @param password     原密码
	 * @param newPassword  新密码
	 */
	boolean updatePassword(Long userId, String password, String newPassword);
}
