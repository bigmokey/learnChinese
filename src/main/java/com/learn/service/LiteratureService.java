package com.learn.service;

import com.learn.entity.Literature;

import java.util.List;

/**
 * (Literature)表服务接口
 *
 * @author makejava
 * @since 2022-03-15 15:08:28
 */
public interface LiteratureService {

    /**
     * 通过ID查询单条数据
     *
     * @param literatureId 主键
     * @return 实例对象
     */
    Literature queryById(Integer literatureId);


    /**
     * 新增数据
     *
     * @param literature 实例对象
     * @return 实例对象
     */
    Literature insert(Literature literature);

    /**
     * 修改数据
     *
     * @param literature 实例对象
     * @return 实例对象
     */
    Literature update(Literature literature);

    /**
     * 通过主键删除数据
     *
     * @param literatureId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer literatureId);

    List<Literature> dividePage(Integer literatureClassifyId);
}
