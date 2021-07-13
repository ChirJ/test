package com.yingkong.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * yingkonggroup
 *
 * @author lin 023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicResponse {
    private String code;
    private Object data;
    private String msg;
    // 修改成功
    // 插入成功
    // 删除成功
    public static BasicResponse success(){
        return  new BasicResponse("0",null,"成功");
    }
    public static BasicResponse success(String msg){
        return  new BasicResponse("0",null,msg);
    }
    public static BasicResponse success(Object data){
        return  new BasicResponse("0",data,"成功");
    }
    public static BasicResponse success(Object data,String msg){
        return  new BasicResponse("0",data,msg);
    }
    public static BasicResponse error(String code,String msg){
        return  new BasicResponse(code,null,msg);
    }
    // 携带错误数据的信息
    public static BasicResponse error(String code,Object data,String msg){
        return  new BasicResponse(code,data,msg);
    }
}
