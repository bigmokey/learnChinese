package com.learn.service;

import com.learn.entity.LiteratureClassify;

import java.util.List;


/**
 * (LiteratureClassify)表服务接口
 *
 * @author Du
 * @since 2022-03-15 19:00:17
 */
public interface LiteratureClassifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param literatureClassifyId 主键
     * @return 实例对象
     */
    LiteratureClassify queryById(Integer literatureClassifyId);

    /**
     * 新增数据
     *
     * @param literatureClassify 实例对象
     * @return 实例对象
     */
    LiteratureClassify insert(LiteratureClassify literatureClassify);

    /**
     * 修改数据
     *
     * @param literatureClassify 实例对象
     * @return 实例对象
     */
    LiteratureClassify update(LiteratureClassify literatureClassify);

    /**
     * 通过主键删除数据
     *
     * @param literatureClassifyId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer literatureClassifyId);

    List<LiteratureClassify> dividePage();
}
