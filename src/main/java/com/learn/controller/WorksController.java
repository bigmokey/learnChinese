package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Poetry;
import com.learn.entity.Works;
import com.learn.entity.request.BrowseWorks;
import com.learn.service.WorksService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Works)表控制层
 *
 * @author Du
 * @since 2022-04-03 13:31:28
 */
@RestController
@RequestMapping("works")
public class WorksController {
    /**
     * 服务对象
     */
    @Resource
    private WorksService worksService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Works> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.worksService.queryById(id));
    }
    //查询所有
    @GetMapping
    public List<BrowseWorks> findAll(@RequestParam(required = false,value = "id",defaultValue = "0") long id){
        return this.worksService.queryAll(id);
    }
    /**
     * 新增数据
     * @param works 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Works> add(@RequestBody Works works) {
        return ResponseEntity.ok(this.worksService.insert(works));
    }

    /**
     * 编辑数据
     * @param works 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Works> edit(Works works) {
        return ResponseEntity.ok(this.worksService.update(works));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.worksService.deleteById(id));
    }

}

