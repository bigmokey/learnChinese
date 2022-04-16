package com.learn.dao;

import com.learn.entity.LiteratureClassify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LiteratureClassify)表数据库访问层
 *
 * @author Du
 * @since 2022-03-15 19:00:17
 */
public interface LiteratureClassifyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param literatureClassifyId 主键
     * @return 实例对象
     */
    LiteratureClassify queryById(Integer literatureClassifyId);

    /**
     * 统计总行数
     *
     * @param literatureClassify 查询条件
     * @return 总行数
     */
    long count(LiteratureClassify literatureClassify);

    /**
     * 新增数据
     *
     * @param literatureClassify 实例对象
     * @return 影响行数
     */
    int insert(LiteratureClassify literatureClassify);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiteratureClassify> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LiteratureClassify> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiteratureClassify> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<LiteratureClassify> entities);

    /**
     * 修改数据
     *
     * @param literatureClassify 实例对象
     * @return 影响行数
     */
    int update(LiteratureClassify literatureClassify);

    /**
     * 通过主键删除数据
     *
     * @param literatureClassifyId 主键
     * @return 影响行数
     */
    int deleteById(Integer literatureClassifyId);

    List<LiteratureClassify> dividePage();
}

