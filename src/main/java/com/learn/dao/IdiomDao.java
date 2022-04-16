package com.learn.dao;

import com.learn.entity.Idiom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Idiom)表数据库访问层
 *
 * @author Du
 * @since 2022-03-17 15:24:22
 */
public interface IdiomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param idiomId 主键
     * @return 实例对象
     */
    Idiom queryById(Integer idiomId);

    /**
     * 统计总行数
     *
     * @param idiom 查询条件
     * @return 总行数
     */
    long count(Idiom idiom);

    /**
     * 新增数据
     *
     * @param idiom 实例对象
     * @return 影响行数
     */
    int insert(Idiom idiom);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Idiom> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Idiom> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Idiom> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Idiom> entities);

    /**
     * 修改数据
     *
     * @param idiom 实例对象
     * @return 影响行数
     */
    int update(Idiom idiom);

    /**
     * 通过主键删除数据
     *
     * @param idiomId 主键
     * @return 影响行数
     */
    int deleteById(Integer idiomId);

    List<Idiom> dividePage();
}

