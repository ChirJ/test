package com.yingkong.core.service;

import com.yingkong.core.model.SysAdmin;
/**
 * @author lin
 * @description
 * @time 2021/7/9 下午 1:29
 */

public interface SysAdminService {
    boolean addAdmin(SysAdmin admin);

    SysAdmin getAdminById(Integer id);
}
