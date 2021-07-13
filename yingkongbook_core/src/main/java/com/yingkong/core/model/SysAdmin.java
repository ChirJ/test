package com.yingkong.core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author lin
 * @description
 * @time 2021/7/9 下午 1:16
 */
@Table(name="sys_admin")
@Data
public class SysAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createTime;

    private Date modifyTime;

    private String name;

    private String phone;

    private String account;

    private String pwd;
    //  2个外键
    @Column(name="headimg")
    private String heading;

    private Integer status;

    private Integer sex;

}
