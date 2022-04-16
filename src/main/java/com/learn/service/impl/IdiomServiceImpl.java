package com.learn.service.impl;

import com.learn.entity.Idiom;
import com.learn.dao.IdiomDao;
import com.learn.service.IdiomService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Idiom)表服务实现类
 *
 * @author Du
 * @since 2022-03-17 15:24:23
 */
@Service("idiomService")
public class IdiomServiceImpl implements IdiomService {
    @Resource
    private IdiomDao idiomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param idiomId 主键
     * @return 实例对象
     */
    @Override
    public Idiom queryById(Integer idiomId) {
        return this.idiomDao.queryById(idiomId);
    }

    /**
     * 新增数据
     *
     * @param idiom 实例对象
     * @return 实例对象
     */
    @Override
    public Idiom insert(Idiom idiom) {
        this.idiomDao.insert(idiom);
        return idiom;
    }

    /**
     * 修改数据
     *
     * @param idiom 实例对象
     * @return 实例对象
     */
    @Override
    public Idiom update(Idiom idiom) {
        this.idiomDao.update(idiom);
        return this.queryById(idiom.getIdiomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param idiomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer idiomId) {
        return this.idiomDao.deleteById(idiomId) > 0;
    }

    @Override
    public List<Idiom> dividePage() {
        return this.idiomDao.dividePage();
    }
}
