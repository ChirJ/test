package com.yingkong.core.dao;

import com.yingkong.core.model.SysAdmin;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author lin
 * @description
 * @time 2021/7/13 上午 10:20
 */
@Repository
public interface SysAdminDao extends Mapper<SysAdmin> {
}
