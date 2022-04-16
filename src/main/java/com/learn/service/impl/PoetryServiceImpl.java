package com.learn.service.impl;

import com.learn.entity.Poetry;
import com.learn.dao.PoetryDao;
import com.learn.service.PoetryService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Poetry)表服务实现类
 *
 * @author Du
 * @since 2022-03-17 15:24:43
 */
@Service("poetryService")
public class PoetryServiceImpl implements PoetryService {
    @Resource
    private PoetryDao poetryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param poetryId 主键
     * @return 实例对象
     */
    @Override
    public Poetry queryById(Integer poetryId) {
        return this.poetryDao.queryById(poetryId);
    }

    /**
     * 新增数据
     *
     * @param poetry 实例对象
     * @return 实例对象
     */
    @Override
    public Poetry insert(Poetry poetry) {
        this.poetryDao.insert(poetry);
        return poetry;
    }

    /**
     * 修改数据
     *
     * @param poetry 实例对象
     * @return 实例对象
     */
    @Override
    public Poetry update(Poetry poetry) {
        this.poetryDao.update(poetry);
        return this.queryById(poetry.getPoetryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param poetryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer poetryId) {
        return this.poetryDao.deleteById(poetryId) > 0;
    }

    @Override
    public List<Poetry> dividePage() {
        return poetryDao.dividePage();
    }
}
