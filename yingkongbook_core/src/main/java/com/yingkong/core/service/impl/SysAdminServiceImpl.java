package com.yingkong.core.service.impl;

import com.yingkong.core.dao.SysAdminDao;
import com.yingkong.core.model.SysAdmin;
import com.yingkong.core.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lin
 * @description
 * @time 2021/7/9 下午 1:29
 */
@Service
public class SysAdminServiceImpl implements SysAdminService {
    @Autowired
    SysAdminDao sysAdminDao;

    @Override
    public boolean addAdmin(SysAdmin admin) {
        return sysAdminDao.insertSelective(admin) > 0;
    }

    @Override
    public SysAdmin getAdminById(Integer id) {
        return sysAdminDao.selectByPrimaryKey(id);
    }
}
