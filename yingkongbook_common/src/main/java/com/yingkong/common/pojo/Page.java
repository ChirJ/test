package com.yingkong.common.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
/**
 * @descript: 分页的类的定义和使用
 * @author:lin
 * @time: 2021/7/6 下午 4:00
 */
@Data
@Repository
public class Page<T> {
    /**
     * 当前第几页
     */
    private int pageNumber = 1;
    /**
     * 每页记录数
     */
    private int pageSize = 5;
    /**
     * 总的条数
     */
    private Long totalCount = 0L;
    /**
     * 总页数
     */
    private Long pageCount = 0L;  // 自动计算的
    /**
     * 分页的数据
     */
    private List<T> content = new ArrayList<>();
    /**
     * 重写setTotalCount方法 在设置总条数的时候 自动算出分页数
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        Long tempPageCount = totalCount % pageSize == 0 ? totalCount/ pageSize :  totalCount/ pageSize + 1;
        this.pageCount = tempPageCount;
    }
}
