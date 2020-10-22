/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.modules.app.service;


import api.zmap.modules.app.form.LoginForm;
import com.baomidou.mybatisplus.extension.service.IService;
import api.zmap.modules.app.entity.UserEntity;

/**
 * 用户
 *
 * @author lewkace@gmail.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
