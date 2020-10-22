/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.service;

import api.zmap.datasource.annotation.DataSource;
import api.zmap.modules.sys.dao.SysUserDao;
import api.zmap.modules.sys.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试多数据源
 *
 * @author lewkace@gmail.com
 */
@Service
@DataSource("slave1")
public class DynamicDataSourceTestService {
    @Autowired
    private SysUserDao sysUserDao;

    @Transactional
    public void updateUser(Long id){
        SysUserEntity user = new SysUserEntity();
        user.setUserId(id);
        user.setMobile("13500000000");
        sysUserDao.updateById(user);
    }

    @Transactional
    @DataSource("slave1")
    public void updateUserBySlave1(Long id){
        SysUserEntity user = sysUserDao.selectById(id);
        //user.setUserId(id);
        user.setMobile("13500000001");
        sysUserDao.updateById(user);
    }

    @DataSource("slave2")
    @Transactional
    public void updateUserBySlave2(Long id){
        SysUserEntity user = new SysUserEntity();
        user.setUserId(id);
        user.setMobile("13500000002");
        sysUserDao.updateById(user);

        //测试事物
        int i = 1/0;
    }
}