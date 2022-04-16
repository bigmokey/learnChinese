package com.learn.service.impl;

import com.learn.entity.Works;
import com.learn.dao.WorksDao;
import com.learn.entity.request.BrowseWorks;
import com.learn.service.WorksService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Works)表服务实现类
 *
 * @author Du
 * @since 2022-04-03 13:31:32
 */
@Service("worksService")
public class WorksServiceImpl implements WorksService {
    @Resource
    private WorksDao worksDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Works queryById(Long id) {
        return this.worksDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param works 实例对象
     * @return 实例对象
     */
    @Override
    public Works insert(Works works) {
        works.setWritetime(new Date());
        this.worksDao.insert(works);
        return works;
    }

    /**
     * 修改数据
     *
     * @param works 实例对象
     * @return 实例对象
     */
    @Override
    public Works update(Works works) {
        this.worksDao.update(works);
        return this.queryById(works.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.worksDao.deleteById(id) > 0;
    }

    @Override
    public List<BrowseWorks> queryAll(long id) {

        return this.worksDao.queryAll(id);
    }
}
