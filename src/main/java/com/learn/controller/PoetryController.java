package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Literature;
import com.learn.entity.Poetry;
import com.learn.service.PoetryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Poetry)表控制层
 *
 * @author Du
 * @since 2022-03-17 15:24:42
 */
@RestController
@RequestMapping("poetry")
public class PoetryController {
    /**
     * 服务对象
     */
    @Resource
    private PoetryService poetryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Poetry> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.poetryService.queryById(id));
    }
    //实现分页功能
    @GetMapping
    public PageInfo<Poetry> dividePage(
            @RequestParam(value = "CurrentPage",required = false,defaultValue = "1")
                    Integer CurrentPage){
        PageHelper.startPage(CurrentPage,8);
        List<Poetry> poetry = poetryService.dividePage();
        PageInfo<Poetry> pageInfo = new PageInfo<>(poetry);
        return pageInfo;
    }
    /**
     * 新增数据
     *
     * @param poetry 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Poetry> add(Poetry poetry) {
        return ResponseEntity.ok(this.poetryService.insert(poetry));
    }

    /**
     * 编辑数据
     *
     * @param poetry 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Poetry> edit(Poetry poetry) {
        return ResponseEntity.ok(this.poetryService.update(poetry));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.poetryService.deleteById(id));
    }

}

