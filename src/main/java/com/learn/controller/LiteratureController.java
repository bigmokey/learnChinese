package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Literature;
import com.learn.service.LiteratureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Literature)表控制层
 *
 * @author makejava
 * @since 2022-03-15 15:08:17
 */
@RestController
@RequestMapping("literature")
public class LiteratureController {
    /**
     * 服务对象
     */
    @Resource
    private LiteratureService literatureService;

    //实现分页功能
    @GetMapping
    public PageInfo<Literature> dividePage(
            @RequestParam(value = "CurrentPage",required = false,defaultValue = "1")
                    Integer CurrentPage,Integer literatureClassifyId){
        PageHelper.startPage(CurrentPage,8);
        List<Literature> Literature = literatureService.dividePage(literatureClassifyId);
        PageInfo<Literature> pageInfo = new PageInfo<>(Literature);
        return pageInfo;
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Literature> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.literatureService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param literature 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Literature> add(Literature literature) {
        return ResponseEntity.ok(this.literatureService.insert(literature));
    }

    /**
     * 编辑数据
     *
     * @param literature 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Literature> edit(Literature literature) {
        return ResponseEntity.ok(this.literatureService.update(literature));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.literatureService.deleteById(id));
    }

}

