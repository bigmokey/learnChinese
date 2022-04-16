package com.learn.dao;

import com.learn.entity.LiteratureDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LiteratureDetail)表数据库访问层
 *
 * @author Du
 * @since 2022-03-15 19:00:14
 */
public interface LiteratureDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param literatureDetailId 主键
     * @return 实例对象
     */
    LiteratureDetail queryById(Integer literatureDetailId);

    /**
     * 统计总行数
     *
     * @param literatureDetail 查询条件
     * @return 总行数
     */
    long count(LiteratureDetail literatureDetail);

    /**
     * 新增数据
     *
     * @param literatureDetail 实例对象
     * @return 影响行数
     */
    int insert(LiteratureDetail literatureDetail);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiteratureDetail> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LiteratureDetail> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LiteratureDetail> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<LiteratureDetail> entities);

    /**
     * 修改数据
     *
     * @param literatureDetail 实例对象
     * @return 影响行数
     */
    int update(LiteratureDetail literatureDetail);

    /**
     * 通过主键删除数据
     *
     * @param literatureDetailId 主键
     * @return 影响行数
     */
    int deleteById(Integer literatureDetailId);

    List<LiteratureDetail> dividePage(
            @Param("literatureClassifyId") Integer literatureClassifyId,
            @Param("literature_id") Integer literature_id);
}

