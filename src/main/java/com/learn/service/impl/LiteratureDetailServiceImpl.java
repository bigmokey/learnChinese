package com.learn.service.impl;

import com.learn.entity.LiteratureDetail;
import com.learn.dao.LiteratureDetailDao;
import com.learn.service.LiteratureDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LiteratureDetail)表服务实现类
 *
 * @author Du
 * @since 2022-03-15 19:00:16
 */
@Service("literatureDetailService")
public class LiteratureDetailServiceImpl implements LiteratureDetailService {
    @Resource
    private LiteratureDetailDao literatureDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param literatureDetailId 主键
     * @return 实例对象
     */
    @Override
    public LiteratureDetail queryById(Integer literatureDetailId) {
        return this.literatureDetailDao.queryById(literatureDetailId);
    }

    /**
     * 新增数据
     *
     * @param literatureDetail 实例对象
     * @return 实例对象
     */
    @Override
    public LiteratureDetail insert(LiteratureDetail literatureDetail) {
        this.literatureDetailDao.insert(literatureDetail);
        return literatureDetail;
    }

    /**
     * 修改数据
     *
     * @param literatureDetail 实例对象
     * @return 实例对象
     */
    @Override
    public LiteratureDetail update(LiteratureDetail literatureDetail) {
        this.literatureDetailDao.update(literatureDetail);
        return this.queryById(literatureDetail.getLiteratureDetailId());
    }

    /**
     * 通过主键删除数据
     *
     * @param literatureDetailId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer literatureDetailId) {
        return this.literatureDetailDao.deleteById(literatureDetailId) > 0;
    }

    @Override
    public List<LiteratureDetail> dividePage(Integer literatureClassifyId,Integer literature_id) {
        return literatureDetailDao.dividePage(literatureClassifyId,literature_id);
    }
}
