package com.learn.dao;

import com.learn.entity.Poetry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Poetry)表数据库访问层
 *
 * @author Du
 * @since 2022-03-17 15:24:42
 */
public interface PoetryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param poetryId 主键
     * @return 实例对象
     */
    Poetry queryById(Integer poetryId);

    /**
     * 统计总行数
     *
     * @param poetry 查询条件
     * @return 总行数
     */
    long count(Poetry poetry);

    /**
     * 新增数据
     *
     * @param poetry 实例对象
     * @return 影响行数
     */
    int insert(Poetry poetry);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Poetry> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Poetry> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Poetry> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Poetry> entities);

    /**
     * 修改数据
     *
     * @param poetry 实例对象
     * @return 影响行数
     */
    int update(Poetry poetry);

    /**
     * 通过主键删除数据
     *
     * @param poetryId 主键
     * @return 影响行数
     */
    int deleteById(Integer poetryId);

    List<Poetry> dividePage();
}

