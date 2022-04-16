package com.learn.service.impl;

import com.learn.entity.LiteratureClassify;
import com.learn.dao.LiteratureClassifyDao;
import com.learn.service.LiteratureClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LiteratureClassify)表服务实现类
 *
 * @author Du
 * @since 2022-03-15 19:00:18
 */
@Service("literatureClassifyService")
public class LiteratureClassifyServiceImpl implements LiteratureClassifyService {
    @Resource
    private LiteratureClassifyDao literatureClassifyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param literatureClassifyId 主键
     * @return 实例对象
     */
    @Override
    public LiteratureClassify queryById(Integer literatureClassifyId) {
        return this.literatureClassifyDao.queryById(literatureClassifyId);
    }

    /**
     * 新增数据
     *
     * @param literatureClassify 实例对象
     * @return 实例对象
     */
    @Override
    public LiteratureClassify insert(LiteratureClassify literatureClassify) {
        this.literatureClassifyDao.insert(literatureClassify);
        return literatureClassify;
    }

    /**
     * 修改数据
     *
     * @param literatureClassify 实例对象
     * @return 实例对象
     */
    @Override
    public LiteratureClassify update(LiteratureClassify literatureClassify) {
        this.literatureClassifyDao.update(literatureClassify);
        return this.queryById(literatureClassify.getLiteratureClassifyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param literatureClassifyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer literatureClassifyId) {
        return this.literatureClassifyDao.deleteById(literatureClassifyId) > 0;
    }

    @Override
    public List<LiteratureClassify> dividePage() {
        return literatureClassifyDao.dividePage();
    }
}
