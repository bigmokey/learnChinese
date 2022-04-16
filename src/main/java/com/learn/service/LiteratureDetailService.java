package com.learn.service;

import com.learn.entity.LiteratureDetail;

import java.util.List;

/**
 * (LiteratureDetail)表服务接口
 *
 * @author Du
 * @since 2022-03-15 19:00:16
 */
public interface LiteratureDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param literatureDetailId 主键
     * @return 实例对象
     */
    LiteratureDetail queryById(Integer literatureDetailId);

    /**
     * 新增数据
     *
     * @param literatureDetail 实例对象
     * @return 实例对象
     */
    LiteratureDetail insert(LiteratureDetail literatureDetail);

    /**
     * 修改数据
     *
     * @param literatureDetail 实例对象
     * @return 实例对象
     */
    LiteratureDetail update(LiteratureDetail literatureDetail);

    /**
     * 通过主键删除数据
     *
     * @param literatureDetailId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer literatureDetailId);

    List<LiteratureDetail> dividePage(Integer literatureClassifyId,Integer literature_id);
}
