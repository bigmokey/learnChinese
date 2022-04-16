package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Literature;
import com.learn.entity.LiteratureClassify;
import com.learn.service.LiteratureClassifyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LiteratureClassify)表控制层
 *
 * @author Du
 * @since 2022-03-15 19:00:16
 */
@RestController
@RequestMapping("literatureClassify")
public class LiteratureClassifyController {
    /**
     * 服务对象
     */
    @Resource
    private LiteratureClassifyService literatureClassifyService;
    //实现分页功能
    @GetMapping
    public PageInfo<LiteratureClassify> dividePage(
            @RequestParam(value = "CurrentPage",required = false,defaultValue = "1")
                    Integer CurrentPage){
        PageHelper.startPage(CurrentPage,3);
        List<LiteratureClassify> LiteratureClassify = literatureClassifyService.dividePage();
        PageInfo<LiteratureClassify> pageInfo = new PageInfo<>(LiteratureClassify);
        return pageInfo;
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<LiteratureClassify> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.literatureClassifyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param literatureClassify 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<LiteratureClassify> add(LiteratureClassify literatureClassify) {
        return ResponseEntity.ok(this.literatureClassifyService.insert(literatureClassify));
    }

    /**
     * 编辑数据
     *
     * @param literatureClassify 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<LiteratureClassify> edit(LiteratureClassify literatureClassify) {
        return ResponseEntity.ok(this.literatureClassifyService.update(literatureClassify));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.literatureClassifyService.deleteById(id));
    }

}

