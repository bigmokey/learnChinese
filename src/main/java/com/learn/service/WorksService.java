package com.learn.service;

import com.learn.entity.Works;
import com.learn.entity.request.BrowseWorks;

import java.util.List;


/**
 * (Works)表服务接口
 *
 * @author Du
 * @since 2022-04-03 13:31:32
 */
public interface WorksService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Works queryById(Long id);

    /**
     * 新增数据
     *
     * @param works 实例对象
     * @return 实例对象
     */
    Works insert(Works works);

    /**
     * 修改数据
     *
     * @param works 实例对象
     * @return 实例对象
     */
    Works update(Works works);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<BrowseWorks> queryAll(long id);
}
