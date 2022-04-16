package com.learn.service;

import com.learn.entity.Poetry;

import java.util.List;


/**
 * (Poetry)表服务接口
 *
 * @author Du
 * @since 2022-03-17 15:24:43
 */
public interface PoetryService {

    /**
     * 通过ID查询单条数据
     *
     * @param poetryId 主键
     * @return 实例对象
     */
    Poetry queryById(Integer poetryId);

    /**
     * 新增数据
     *
     * @param poetry 实例对象
     * @return 实例对象
     */
    Poetry insert(Poetry poetry);

    /**
     * 修改数据
     *
     * @param poetry 实例对象
     * @return 实例对象
     */
    Poetry update(Poetry poetry);

    /**
     * 通过主键删除数据
     *
     * @param poetryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer poetryId);

    List<Poetry> dividePage();
}
