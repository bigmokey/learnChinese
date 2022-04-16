package com.learn.dao;

import com.learn.entity.Works;
import com.learn.entity.request.BrowseWorks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Works)表数据库访问层
 *
 * @author Du
 * @since 2022-04-03 13:31:29
 */
public interface WorksDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Works queryById(Long id);

    /**
     * 统计总行数
     *
     * @param works 查询条件
     * @return 总行数
     */
    long count(Works works);

    /**
     * 新增数据
     *
     * @param works 实例对象
     * @return 影响行数
     */
    int insert(Works works);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Works> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Works> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Works> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Works> entities);

    /**
     * 修改数据
     *
     * @param works 实例对象
     * @return 影响行数
     */
    int update(Works works);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    List<BrowseWorks> queryAll(@Param("uid") long id);
}

