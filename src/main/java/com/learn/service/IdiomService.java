package com.learn.service;

import com.learn.entity.Idiom;

import java.util.List;


/**
 * (Idiom)表服务接口
 *
 * @author Du
 * @since 2022-03-17 15:24:23
 */
public interface IdiomService {

    /**
     * 通过ID查询单条数据
     *
     * @param idiomId 主键
     * @return 实例对象
     */
    Idiom queryById(Integer idiomId);

    /**
     * 新增数据
     *
     * @param idiom 实例对象
     * @return 实例对象
     */
    Idiom insert(Idiom idiom);

    /**
     * 修改数据
     *
     * @param idiom 实例对象
     * @return 实例对象
     */
    Idiom update(Idiom idiom);

    /**
     * 通过主键删除数据
     *
     * @param idiomId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer idiomId);

    List<Idiom> dividePage();
}
