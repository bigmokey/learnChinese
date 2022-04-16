package com.learn.service.impl;

import com.learn.entity.Literature;
import com.learn.dao.LiteratureDao;
import com.learn.service.LiteratureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Literature)表服务实现类
 *
 * @author makejava
 * @since 2022-03-15 15:08:29
 */
@Service("literatureService")
public class LiteratureServiceImpl implements LiteratureService {
    @Resource
    private LiteratureDao literatureDao;

    /**
     * 通过ID查询单条数据
     *
     * @param literatureId 主键
     * @return 实例对象
     */
    @Override
    public Literature queryById(Integer literatureId) {
        return this.literatureDao.queryById(literatureId);
    }


    /**
     * 新增数据
     *
     * @param literature 实例对象
     * @return 实例对象
     */
    @Override
    public Literature insert(Literature literature) {
        this.literatureDao.insert(literature);
        return literature;
    }

    /**
     * 修改数据
     *
     * @param literature 实例对象
     * @return 实例对象
     */
    @Override
    public Literature update(Literature literature) {
        this.literatureDao.update(literature);
        return this.queryById(literature.getLiteratureId());
    }

    /**
     * 通过主键删除数据
     *
     * @param literatureId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer literatureId) {
        return this.literatureDao.deleteById(literatureId) > 0;
    }

    @Override
    public List<Literature> dividePage(Integer literatureClassifyId) {
        return literatureDao.dividePage(literatureClassifyId);
    }
}
