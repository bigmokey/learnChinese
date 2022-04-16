package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Idiom;
import com.learn.entity.Poetry;
import com.learn.service.IdiomService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Idiom)表控制层
 *
 * @author Du
 * @since 2022-03-17 15:24:21
 */
@RestController
@RequestMapping("idiom")
public class IdiomController {
    /**
     * 服务对象
     */
    @Resource
    private IdiomService idiomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Idiom> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.idiomService.queryById(id));
    }
    //实现分页功能
    @GetMapping
    public PageInfo<Idiom> dividePage(
            @RequestParam(value = "CurrentPage",required = false,defaultValue = "1")
                    Integer CurrentPage){
        PageHelper.startPage(CurrentPage,8);
        List<Idiom> idioms = idiomService.dividePage();
        PageInfo<Idiom> pageInfo = new PageInfo<>(idioms);
        return pageInfo;
    }
    /**
     * 新增数据
     *
     * @param idiom 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Idiom> add(Idiom idiom) {
        return ResponseEntity.ok(this.idiomService.insert(idiom));
    }

    /**
     * 编辑数据
     *
     * @param idiom 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Idiom> edit(Idiom idiom) {
        return ResponseEntity.ok(this.idiomService.update(idiom));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.idiomService.deleteById(id));
    }

}

