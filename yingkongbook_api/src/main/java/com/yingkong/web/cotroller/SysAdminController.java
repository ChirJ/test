package com.yingkong.web.cotroller;

import com.yingkong.common.pojo.BasicResponse;
import com.yingkong.core.model.SysAdmin;
import com.yingkong.core.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.ReactiveTransaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @description
 * @time 2021/7/9 下午 1:22
 */
@RestController
@RequestMapping("/admin")  // 通过前缀区分 那个表的 增删改查的逻辑
public class SysAdminController {

    @Autowired
    SysAdminService sysAdminService;

    @PostMapping("/add")
    public BasicResponse addAdmin(SysAdmin admin){
        if(admin.getName()!=null && admin.getPwd()!=null){
            if(sysAdminService.addAdmin(admin)){
                return BasicResponse.success("插入成");
            }else {
                return BasicResponse.error("1002","插入失败，服务繁忙");
            }
        }else {
            return BasicResponse.error("1001","没有提交参数");
        }
    }

    @GetMapping("/getAdminById")
    public BasicResponse getAdminById(Integer id){
        if(id!=null){
           SysAdmin admin =  sysAdminService.getAdminById(id);
           if(admin!=null){
               System.out.println("123");
               return BasicResponse.success(admin);
           }else {
               System.out.println("nihao");
               return BasicResponse.error("1002","用户不存在或服务器繁忙");

           }
        }else {
            return BasicResponse.error("1001","没有提交参数信息");
        }
    }
}
